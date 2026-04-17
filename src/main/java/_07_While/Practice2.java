package _07_While;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {

        String password = "1234";
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int maxCount = 5;

        while (true) {
            // 비밀번호 입력받기
            // 맞추면 "문이 열립니다" 출력
            // 틀리면, "다시 입력하세요" 출력
            // 5회 틀리면, "문이 잠깁니다." 출력하고 탈출
            System.out.printf("비밀번호를 입력하여주세요 > ");
            String pw = scanner.nextLine();
            if (password.equals(pw)) {
                System.out.println("문이 열립니다.");
                break;
            } else {
                count++;
                if (count == maxCount) {
                    System.out.println("문이 잠깁니다.");
                    break;
                }
                System.out.println("남은 시도 횟수: " + (maxCount - count));
                System.out.println("다시 입력하세요.");
            }

        }

    }

}
