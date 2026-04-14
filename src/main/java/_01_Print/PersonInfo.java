package _01_Print;

import java.util.Scanner;

public class PersonInfo {

    public static void main(String[] args) {

        /*
            아래의 데이터를 적절한 자료형과 변수명으로 저장하고,
            각 변수들을 출력해 주세요
            1. 이름, 2.출생연도, 3.키(소숫점), 4. 혈액형
            5. 학생여부(true/false)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 입력: ");
        String name = scanner.nextLine();
        System.out.print("출생연도: ");
        int birth = scanner.nextInt();
        System.out.print("키 입력(소숫점 포함): ");
        double height = scanner.nextDouble(); scanner.nextLine();
        System.out.print("혈액형 입력: ");
        String blood = scanner.nextLine();
        System.out.print("학생 여부(y / n): ");
        String student = scanner.nextLine();
        boolean isStudent = true;

        if (student == "n" || student == "N") isStudent = false;

        System.out.println("이름: " + name + "\n출생연도: " + birth + "\n키: " + height + "\n혈액형: " + blood + "\n학생여부: " + isStudent);



    }

}
