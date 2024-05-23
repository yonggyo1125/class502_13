package games;

import java.net.ServerSocket;

public class Server {

    private ServerSocket serverSocket;

    /**
     * 서버 시작
     *
     * @return
     */
    public ServerSocket start() {
        try {
            serverSocket = new ServerSocket();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return serverSocket;
    }
}
