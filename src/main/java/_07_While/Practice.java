package _07_While;

import java.util.Random;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 랜덤
        Random random = new Random();

        // 1 이상 11 미만 정수 중 랜덤 하나 뽑기.
        int randomNum = random.nextInt(1, 11);
        System.out.println(randomNum);

        while(true) {
            System.out.print("숫자 입력 > ");
            int myGuess = scanner.nextInt();

            if (myGuess == randomNum) {
                System.out.println("정답입니다: " + myGuess);
                break;
            }

            System.out.println("다시 입력하세요!");
        }

        // 1 ~ 100 사이 랜덤숫자 뽑은 후, 대입
        int randomInt = random.nextInt(1, 101);
        while (true) {
            // 1. 1 ~ 100사이 정수 입력 받기
            // 2. 입력값 > 랜덤값 "down" 출력
            // 입력값 < 랜덤값 "up" 출력
            // 입력값 == 랜덤값 "정답입니다" 출력 후 탈출

            System.out.printf("1 ~ 100 사이 정수를 입력해주세요 > ");
            int inputNum = scanner.nextInt();

            // 입력값 검증(1 ~ 100)
            if (inputNum < 1 || inputNum > 100) {
                System.out.println("1 ~ 100 사이의 값을 입력하세요.");
                continue;
            }

            if (randomInt > inputNum) {
                System.out.println("up");
            } else if (randomInt < inputNum) {
                System.out.println("down");
            } else {
                System.out.println("정답입니다");
                break;
            }
        }

    }

}
