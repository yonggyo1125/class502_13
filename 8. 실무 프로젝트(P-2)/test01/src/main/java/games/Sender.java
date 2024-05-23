package games;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * 소켓 메세지 전송
 */
public class Sender<T> implements Runnable {
    private Socket socket;

    private Thread th;

    private ObjectOutputStream out;

    // 전송할 데이터
    private T data;

    public Sender(Socket socket) {
        this.socket = socket;
        th = new Thread(this);
        try {
            out = new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        th.start();
    }

    public void send(T data) {
        this.data = data;
    }

    @Override
    public void run() {
        while(true) {
            if (data != null && out != null) {
                try {
                    out.writeObject(data);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                data = null; // 전송 후 데이터 비워주기
            }
        }
    }
}
