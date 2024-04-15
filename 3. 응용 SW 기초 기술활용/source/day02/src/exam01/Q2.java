package exam01;

public class Q2 {
    public static void main(String[] args) {
        // 학생 40명이 리조트에 수학여행을 갔습니다. 리조트로 수학여행을 갔습니다. 리조트는 방이 10개 있고 방번호는 0~9번까지 있습니다, 40명의 학생이 각각 번호표를 받아 한 방에 4명씩 배정하여 다음과 같이 출력하시오(예 : 학생1, 방번호 1번)

        for (int i = 1; i <= 40; i++) {
            int roomNo = i % 10; // 0 ~ 9
            System.out.printf("학생%d, 방번호 %d번%n", i, roomNo);
        }
    }
}
