package exam01;

public enum Transportation {
    BUS(1400),
    TAXI(4500),
    SUBWAY(1300);

    private final int fare;

    Transportation(int fare) {
        this.fare = fare;
    }

    public int getFare() {
        return fare;
    }

    //public abstract int getTotal(int person);
}
