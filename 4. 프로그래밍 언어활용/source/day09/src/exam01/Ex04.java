package exam01;

import java.util.StringTokenizer;

public class Ex04 {
    public static void main(String[] args) {
        String fruits = "Apple#Orange,Melon_Banana+Mango";
        StringTokenizer st = new StringTokenizer(fruits, "#,_+");

        while(st.hasMoreTokens()) {
            String fruit = st.nextToken();
            System.out.println(fruit);
        }
    }
}
