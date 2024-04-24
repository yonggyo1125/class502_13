package exam02;

public class Ex05 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        // 메서드 체이닝
        String str = sb.append("ABC")
                        .append("DEF")
                        .append("GHI")
                        .toString();
        System.out.println(str);
        /*
        StringBuffer sb2 = sb.append("ABC");
        StringBuffer sb3 = sb2.append("DEF");
        */
    }
}
