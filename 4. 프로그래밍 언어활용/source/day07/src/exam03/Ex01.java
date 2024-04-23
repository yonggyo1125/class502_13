package exam03;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Resources res = new Resources();
        Resources2 res2 = new Resources2();
        try(res; res2) {
            // res가 AutoClosable 인터페이스 구현 객체인지 체크 -> close() 메서드 자동 호출

            // 자동 해제 과정
            //AutoCloseable auto = res;
            //auto.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
}