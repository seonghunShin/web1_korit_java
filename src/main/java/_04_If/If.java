package _04_If;

public class If {

    public static void main(String[] args) {

        // if문 - 코드 분기 목적으로 사용하는 제어 문법
        int height = 130;
        int age = 23;
        // if (boolean데이터) {
        //      boolean이 true면 실행되는 코드
        // }
        if (height >= 120) {
            System.out.println("탑승가능 합니다.");
        }

        if (true) {
            System.out.println("저는 항상 실행됩니다.");
        }

        if (height >= 120 && age < 14) {
            System.out.println("탑승가능합니다.");
        }

        if (age >= 20) {
            System.out.println("성인입니다.");
        } else { // 위의 조건들이 모두 false일 때
            System.out.println("미성년자입니다.");
        }

        // if ~ else if ~ else 문
        // 위에서부터 아래로 검사함(동시에 여러조건을 검사하는것이 x)
        // true가 연산되면, 해당 블럭코드를  실행하고 탈출
        // 오름차순, 내림차순으로 작성해야한다.
        if (age <= 7) {
            System.out.println("유치원갑니다.");
        } else if (age <= 13) {
            System.out.println("초등학생 갑니다.");
        } else if (age <= 16) {
            System.out.println("중학교 갑니다.");
        } else if (age <= 19) {
            System.out.println("고등학교 갑니다.");
        } else {
            System.out.println("성인입니다.");
        }

        // 내가 정한 규칙(비즈니스로직)에서 조건문을 작성할 때
        boolean isLogin = false; // 로그인x
        boolean isBanned = true; // 밴계정o

        if (!isLogin) { // 로그아웃이라면
            System.out.println("로그인이 필요합니다.");
        } else if (isBanned){
            // 위 조건이 false일 때 실행 -> 로그인때만 실행
            System.out.println("정지된 계정입니다.");
        }


        // 실습1) num1의 절댓값을 출력
        int num1 = -12;
        if (num1 < 0) {
            System.out.println(num1 * -1);
        } else System.out.println(num1);


        //실습2) num2, num3 중 큰 값을 출력
        int num2 = 10;
        int num3 = 5;
        if (num2 > num3) {
            System.out.println(num2);
        } else if (num3 > num2) {
            System.out.println(num3);
        } else System.out.println("같다");

        // 실습3) bmi 계산
        // bmi = 체중(kg) / 키(m) * 키(m)
        // 18.5 미만 -> 저체중
        // 18.5 ~ 25 미만 -> 정상
        // 25 ~ 30 미만 -> 과체중
        // 30 이상 -> 비만
        // 철수 (174, 70)의 비만도결과를 출력.

        double cs_height = 174 / 100.0; // int와 double이 연산되면
        double cs_weight = 70.0;
        // 연산자 우선순위: () > 대입
        // 우선순위 동이하면, 왼쪽부터 연산
        double bmi = cs_weight / (cs_height * cs_weight);
        if (bmi < 18.5) System.out.println("저체중");
        else if (bmi < 25.0) System.out.println("정상");
        else if (bmi < 30.0) System.out.println("과체중");
        else System.out.println("비만");

    }

}
