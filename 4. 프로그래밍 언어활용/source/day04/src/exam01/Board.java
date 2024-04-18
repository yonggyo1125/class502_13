package exam01;

public class Board {
   // private static Board instance = new Board(); // 클래스 로드 시점 부터 객체 생성
    private static Board instance;

    private Board() {}

    public static Board getInstance() {
        if (instance == null) { // 필요한 시점 최소 1번만 생성
            instance = new Board();
        }

        return instance;
    }
}
