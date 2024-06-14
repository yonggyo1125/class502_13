package exam02;

public class Ex02 {
    public static void main(String[] args) {
        //Company c1 = Company.instance;
        //Company c2 = Company.instance;
        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();

        System.out.println(c1 == c2);
    }
}
