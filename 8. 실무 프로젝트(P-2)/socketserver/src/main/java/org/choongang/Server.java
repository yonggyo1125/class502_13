package org.choongang;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class Server {

    private ExecutorService threadPool;
    private ObjectMapper om;

    public Server() {
        threadPool = new ThreadPoolExecutor(2, 100, 120L, TimeUnit.SECONDS, new SynchronousQueue<>(){});

        om = new ObjectMapper();
        om.registerModule(new JavaTimeModule()); // java.time 패키지 대응
    }

    public void start() {
        try {
            ServerSocket server = new ServerSocket(9999);

            while(true) {
                Socket socket = server.accept();

                SocketHandler socketHandler = new SocketHandler(socket);

                // 수신 처리
                socketHandler.inputHandler((data) -> {

                });

                // 전송 처리
                socketHandler.outputHandler();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class SocketHandler {
        private Socket socket;
        private Object data;

        public SocketHandler(Socket socket) {
            this.socket = socket;

        }

        public void setData(Object data) {
            this.data = data;
        }

        public void inputHandler(Consumer<String> handler) {
            threadPool.execute(() -> {
                try (DataInputStream dis = new DataInputStream(socket.getInputStream())) {

                    String data = dis.readUTF();
                    handler.accept(data);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }

        public void outputHandler() {
            threadPool.execute(() -> {
                while(true) {
                    if (data == null) {
                        Thread.currentThread().yield();
                        continue;
                    }

                    try (DataOutputStream dos = new DataOutputStream(socket.getOutputStream())) {
                        // 자바 객체 data -> JSON 문자열 변환
                        String json = om.writeValueAsString(data);
                        dos.writeUTF(json); // 데이터 전송

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    data = null; // 전송 후 데이터 비우기
                }
            });
        }
    }
}
