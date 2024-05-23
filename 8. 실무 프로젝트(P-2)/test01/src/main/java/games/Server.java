package games;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server implements Runnable {

    private ServerSocket serverSocket;

    private Thread[] threads;
    private Map<String, Socket> clients;
    public Server(int games) {
        try {
            serverSocket = new ServerSocket(9999);
            threads = new Thread[games];
            clients = new HashMap<>();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 서버 소켓 시작
    public void start() {
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(this);
            threads[i].start();
        }
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        String name = th.getName();
        while(true) {
            try {
                Socket socket = serverSocket.accept();
                clients.put(name, socket); // 접속한 소켓 저장

                Receiver<Data> receiver = new Receiver<>(socket, (data) -> {
                    String from = data.getFrom(); // 보낸 사람
                    String to = data.toString(); // 받는 사람
                    System.out.println(data);
                });

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
