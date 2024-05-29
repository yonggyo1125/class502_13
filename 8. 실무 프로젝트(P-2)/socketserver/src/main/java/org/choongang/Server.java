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

    private ExecutorService threadPool;

    public Server() {
        threadPool = new ThreadPoolExecutor(2, 100, 120L, TimeUnit.SECONDS, new SynchronousQueue<>(){});
    }

    public void start() {
        try {
            ServerSocket server = new ServerSocket(9999);

            while(true) {
                Socket socket = server.accept();


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class SocketHandler {
        private Socket socket;

        public SocketHandler(Socket socket) {
            this.socket = socket;
        }

        public void inputHandler() {
            threadPool.execute(() -> {
                try (DataInputStream dis = new DataInputStream(socket.getInputStream())) {

                    String data = dis.readUTF();
                    System.out.println(data);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }

        public void outputHandler() {
            threadPool.execute(() -> {

            });
        }
    }
}
