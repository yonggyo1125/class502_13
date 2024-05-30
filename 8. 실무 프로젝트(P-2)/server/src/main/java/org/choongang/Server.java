package org.choongang;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class Server {
    private ServerSocket serverSocket;
    private ExecutorService threadPool;
    private ObjectMapper om;
    private Map<String, Socket> clients; // 접속한 사용자(소켓)

    public Server() {

        try {
            serverSocket = new ServerSocket(9999);
        } catch (IOException e) {
            e.printStackTrace();
        }

        threadPool = new ThreadPoolExecutor(2, 100, 120L, TimeUnit.SECONDS, new SynchronousQueue<>(){});

        om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());

        clients = new HashMap<>();
    }

    public void start() {

        while(true) {
            try {
                Socket socket = serverSocket.accept();

                SocketHandler handler = new SocketHandler(socket);

                // 수신 처리
                handler.input(data -> {
                    SocketData sData = toObject(data);
                    String from = sData.getFrom(); // 보낸 사람
                    // 최초 접속인 경우, 사용자(소켓) 등록
                    if (!clients.containsKey(from)) {
                        clients.put(from, socket);
                    }

                    // 전송
                    System.out.println(sData);
                    String to = sData.getTo();
                    handler.send(to, sData);
                });

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private SocketData toObject(String json) {
        SocketData data = null;
        try {
            data = om.readValue(json, SocketData.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return data;
    }

    private String toJSON(SocketData sData) {
        String data = null;
        try {
            data = om.writeValueAsString(sData);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return data;
    }

    class SocketHandler {
        private Socket socket;

        public SocketHandler(Socket socket) {
            this.socket = socket;
        }

        // 수신 처리
        public void input(Consumer<String> handler) {
            threadPool.execute(() -> {
                try {
                    DataInputStream dis = new DataInputStream(socket.getInputStream());

                    while(true) {
                        if (socket == null || socket.isClosed() || handler == null) {
                            Thread.currentThread().yield();
                            break;
                        }

                        String data = dis.readUTF();
                        handler.accept(data);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }

        // 전송 처리
        public void output(Socket toSocket, SocketData data) {
            if (toSocket == null || toSocket.isClosed() || data == null) {
                return;
            }

            threadPool.execute(() -> {
                try {
                    DataOutputStream dos = new DataOutputStream(toSocket.getOutputStream());

                    String json = toJSON(data);
                    dos.writeUTF(json);

                } catch(IOException e) {
                    e.printStackTrace();
                }
           });
        }

        public void send(String to, SocketData data) {
            if (to.equals("all")) { // 전체 전송
                clients.values().forEach(s -> output(s, data));
            } else { // 특정 사용자 전송
                Socket s = clients.get(to);
                if (s != null) {
                    output(s, data);
                }
            }
        }

        /**
         * 소켓 연결이 종료된 경우 clients에서 제거
         * 10초마다 소켓 연결상태 체크
         */
        public void monitoring() {
            Thread th = new Thread(() -> {
                while(true) {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {}


                }
            });

            th.setDaemon(true);

            th.start();
        }
    }
}
