package exam02;

public abstract class Transporation2 /*extends java.lang.Enum */ {
    public static final Transporation2 BUS = new Transporation2(){

    };
    public static final Transporation2 SUBWAY = new Transporation2(){};
    public static final Transporation2 TAXI = new Transporation2(){};

    private Transporation2() {}

    //public abstract int getTotal(int person);
}
