package exam03;

public class HighSchoolStudent extends Student {

    public HighSchoolStudent(String name) {
      super(1000, name);
    }

    @Override
    public String toString() {
        return "HighSchoolStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
