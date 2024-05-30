package org.choongang;

import java.io.DataInputStream;
import java.net.Socket;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 9999);
        try(DataInputStream dis = new DataInputStream(socket.getInputStream())) {
            while(true) {
                String json = dis.readUTF();
                System.out.println(json);
            }
        }
     }
}
