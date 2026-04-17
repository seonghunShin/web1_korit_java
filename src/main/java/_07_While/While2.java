package _07_While;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {

        /*
            while(조건식) {} : (조건 -> 코드실행) x n
            do {} while(); : (코드실행 -> 조건) x n

            - 최소 한 번은 실행되는 반복문
         */

        // 메뉴 선택시
        Scanner scanner = new Scanner(System.in);
        int myChoice;
        int balance = 0;
        do {
            System.out.println("--메뉴선택--");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액확인");
            System.out.println("0. 종료");

            System.out.print("메뉴를 선택하세요 > ");
            myChoice = scanner.nextInt();

            if(myChoice == 1) { // 입금
                System.out.print("입금할 금액 > ");
                int money = scanner.nextInt();
                balance += money;
                System.out.println(money + "원 입금완료");
            } else if (myChoice == 2) { // 출금
                System.out.printf("출금할 금액 > ");
                int money = scanner.nextInt();
                if (balance < money) {
                    System.out.println("잔액보다 많습니다. 다시 입력하여주세요.");
                    continue;
                } else {
                    balance -= money;
                }
                System.out.println(money + "원 출금완료.");
            } else if (myChoice == 3) { // 잔액확인
                System.out.println("잔액: " + balance);
            } else if (myChoice == 0) {
                System.out.println();
            } else {
                System.out.println("해당 번호는 지원되지 않는 번호입니다.");
            }

        } while(myChoice != 0); // myChoice == 0이면 탈출

        System.out.println("ATM 종료");

    }
}
