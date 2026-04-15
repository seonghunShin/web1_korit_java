package _04_If;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        String realId = "java";
        String realPassword = "qwer1234";

        // 1. 스캐너를 통해 아이디, 패스워드를 입력받는다.
        // 2. 입력받은 아이디, 패스워드가 모두 동일하면,
        // 로그인 성공 출력, 아니라면 로그인 실패 출력.

        Scanner scanner = new Scanner(System.in);
        System.out.printf("아이디를 입력하여주세요 > ");
        String loginId = scanner.nextLine();
        System.out.printf("비밀번호를 입력하여주세요 > ");
        String loginPw = scanner.nextLine();

//        boolean isSameId = realId.equals(loginId);
//        boolean isSamePassword = realPassword.equals(loginPw);
//        boolean isValidLogin = isSameId && isSamePassword;
//
//        if (isValidLogin) System.out.println("로그인 성공");
//        else System.out.println("로그인 실패");

        if (realId.equals(loginId) && realPassword.equals(loginPw)) System.out.println("로그인 성공");
        else System.out.println("로그인 실패");

    }

}
