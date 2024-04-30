package exam02;

import java.util.*;

public class Ex03 {
    public static void main(String[] args) {
        //HashMap<String, String> members = new HashMap<>();
        Map<String, String> members = new TreeMap<>(Comparator.reverseOrder());

        members.put("user01", "사용자01");
        members.put("user02", "사용자02");
        members.put("user03", "사용자03");
        members.put("user04", "사용자04");
        members.put("user05", "사용자05");

        //Set<Map.Entry<String, String>> entries = members.entrySet();

        for (Map.Entry<String, String> entry : members.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("아이디: %s, 회원명: %s%n", key, value);
        }

    }
}
