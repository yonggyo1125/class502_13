package exam01;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public Schedule() {
        this(2024, 4, 18);
    }

    public Schedule(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (this.month == 2 && day > 28) {
            day = 28;
        }

        this.day = day;
    }

    public void showDate() {
        System.out.printf("year=%d, month=%d, day=%d%n", year, month, day);
        printThis(); // this.printThis()
    }

    public void printThis() {
        System.out.println(this);
    }

    public Schedule returnThis() {
        return this;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
