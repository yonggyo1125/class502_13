package exam01;

public class Student {
    private int ban;
    private String name;

    public Student(int ban, String name) {
        this.ban = ban;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ban=" + ban +
                ", name='" + name + '\'' +
                '}';
    }
}
