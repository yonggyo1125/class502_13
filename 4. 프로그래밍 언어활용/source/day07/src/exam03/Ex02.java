package exam03;

public class Ex02 {
    public static void main(String[] args) {
        try(Resources res = new Resources();
            Resources2 res2 = new Resources2()) { // close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
