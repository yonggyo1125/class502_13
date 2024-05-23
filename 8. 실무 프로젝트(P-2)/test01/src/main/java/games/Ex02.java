package games;

import java.io.IOException;
import java.net.Socket;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);
        Data data = new Data("n1", "n2", "데이터");
        Sender<Data> sender = new Sender<>(socket);
        sender.send(data);
        Receiver<Data> receiver = new Receiver<>(socket, (d) -> {
            System.out.println(d);
        });
    }
}
