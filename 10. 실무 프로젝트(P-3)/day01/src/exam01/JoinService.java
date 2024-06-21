package exam01;

public class JoinService {
    public JoinService() {
        System.out.println("기본 생성자 호출");
    }

    public JoinService(String arg1, int arg2) {
        System.out.printf("매개변수가 있는 생성자 호출:%s, %d%n", arg1, arg2);
    }
}
