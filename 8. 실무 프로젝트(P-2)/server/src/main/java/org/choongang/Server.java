package org.choongang;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    private ServerSocket serverSocket;
    private ExecutorService threadPool;

    public Server() {
        try {
            serverSocket = new ServerSocket(9999);
        } catch (IOException e) {
            e.printStackTrace();
        }

        threadPool = new ThreadPoolExecutor(2, 100, 120L, TimeUnit.SECONDS, new SynchronousQueue<>(){});
    }

    public void start() {

        while(true) {
            try {
                Socket socket = serverSocket.accept();

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
        public void input() {
            threadPool.execute(() -> {
                try(DataInputStream dis = new DataInputStream(socket.getInputStream())) {

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
