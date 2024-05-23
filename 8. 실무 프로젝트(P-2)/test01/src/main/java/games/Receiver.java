package games;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.function.Consumer;

/**
 * 소켓 메세지 수신
 */
public class Receiver<T> implements Runnable {

    private Socket socket;

    private Thread th;
    private ObjectInputStream in;

    private Consumer<T> eventHandler;

    public Receiver(Socket socket, Consumer<T> eventHandler) {
        this.socket = socket;
        this.eventHandler = eventHandler;
        Thread th = new Thread(this);
        try {
            in = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        th.start();
    }

    @Override
    public void run() {
        while(true) {
            if (in != null) {
                try {
                    T data = (T) in.readObject();
                    if (data != null) {  // 데이터 수신시
                        eventHandler.accept(data);
                    }
                } catch (Exception e) {
                }
            }
        }
    }
}
