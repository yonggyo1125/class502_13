package sockets;

public class Ex03 {
    public static void main(String[] args) {
        Server server = new Server(10);
        server.start();
    }
}
