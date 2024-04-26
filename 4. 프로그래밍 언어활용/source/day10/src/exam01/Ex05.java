package exam01;

public class Ex05 {
    public static void main(String[] args) {
        String tran1 = "BUS";

        //Transportation BUS = Enum.valueOf(Transportation.class, tran1);
        //System.out.println(BUS.name());

        Transportation BUS = Transportation.valueOf(tran1);

        System.out.println(BUS == Transportation.BUS);
    }
}
