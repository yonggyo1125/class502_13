package sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server implements Runnable {

    private ExecutorService threadPool;
    private ServerSocket serverSocket;
    private Map<String, Socket> clients;

    public Server(int nums) {
        threadPool = new ThreadPoolExecutor(2, nums, 120L, TimeUnit.SECONDS, new SynchronousQueue<>(){});
        clients = new HashMap<>();

        try {
            serverSocket = new ServerSocket(9999);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void start() {
        threadPool.execute(this);
    }

    @Override
    public void run() {
        while(true) {
            try {
                Socket socket = serverSocket.accept();

                String clientname = "이름1";
                clients.put(clientname, socket);

                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Data data = (Data)ois.readObject();
                System.out.println("수신 데이터 : " + data);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
