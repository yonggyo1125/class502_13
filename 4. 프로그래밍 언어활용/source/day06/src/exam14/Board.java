package exam14;

public class Board {

    private static Board instance;

    private Board() {}

    public static Board getInstance() {
        if (instance == null) {
            instance = new Board();
        }

        return instance;
    }
}
