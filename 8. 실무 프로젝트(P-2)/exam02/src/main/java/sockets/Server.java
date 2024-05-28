package sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server implements Runnable {

    private ExecutorService threadPool;
    private ServerSocket serverSocket;


    public Server(int nums) {
        threadPool = new ThreadPoolExecutor(2, nums, 120L, TimeUnit.SECONDS, new SynchronousQueue<>(){});

        try {
            serverSocket = new ServerSocket(9999);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        while(true) {
            try {
                Socket socket = serverSocket.accept();



            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
