package sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Ex02 {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 9999);
        OutputStream oos = socket.getOutputStream(); // 연결된 서버 소켓으로 데이터 전송
        DataOutputStream dos = new DataOutputStream(oos);
        dos.writeUTF("안녕하세요, 서버님!");

        InputStream in = socket.getInputStream();
        DataInputStream dis = new DataInputStream(in);
        String str = dis.readUTF();
        System.out.println(str);

    }
}
