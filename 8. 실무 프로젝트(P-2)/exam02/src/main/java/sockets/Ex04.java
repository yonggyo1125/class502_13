package sockets;

import java.io.ObjectOutputStream;
import java.net.Socket;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 9999);
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        Data data = new Data();
        data.setFrom("클라언트1");
        data.setTo("클라언트2");
        data.setMessage("메세지");

        oos.writeObject(data);
    }
}
