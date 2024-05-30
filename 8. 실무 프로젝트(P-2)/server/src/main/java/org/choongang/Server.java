package org.choongang;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class Server {
    private ServerSocket serverSocket;
    private ExecutorService threadPool;
    private ObjectMapper om;

    public Server() {

        try {
            serverSocket = new ServerSocket(9999);
        } catch (IOException e) {
            e.printStackTrace();
        }

        threadPool = new ThreadPoolExecutor(2, 100, 120L, TimeUnit.SECONDS, new SynchronousQueue<>(){});

        om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());
    }

    public void start() {

        while(true) {
            try {
                Socket socket = serverSocket.accept();

                SocketHandler handler = new SocketHandler(socket);

                // 수신 처리
                handler.input(data -> {
                    System.out.println(data);
                });

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    class SocketHandler {
        private Socket socket;

        public SocketHandler(Socket socket) {
            this.socket = socket;
        }

        // 수신 처리
        public void input(Consumer<String> handler) {
            threadPool.execute(() -> {
                try(DataInputStream dis = new DataInputStream(socket.getInputStream())) {

                    while(true) {
                        if (socket == null || handler == null) {
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
        public void output() {
            threadPool.execute(() -> {

            });
        }
    }
}
