package _01_Print;

// 주석: 인간이 읽으라고 적는것(컴퓨터는 무시함)
// 자바는 객체지향언어 -> 모든 문법이 class위주
// .java파일(영어) -> .class파일(숫자) -> 실행
// 이때, 숫자로 바꾸는 과정을 "컴파일"이라고 함
// {} : 코드구역
public class HelloJava { // HelloJava 시작

    public static void main(String[] args) { // main 메서드 시작
        // 자바는 언제나 main을 기점으로 동작한다.
        System.out.println("Hello Java!"); // 세미콜론: 코드 끝
        
        // 아래의 문자열을 출력해주세요!
        // 이름: 홍길동
        // 나이: 25
        // 주소: 부산시 해운대
        System.out.println("이름: 홍길동");
        System.out.println("나이: 25");
        System.out.println("주소: 부산시 해운대");

        String myName = "홍길동";
        int age = 25;
        String address = "부산시 해운대";

        System.out.println("이름: " + myName);
        System.out.println("나이: " + age);
        System.out.println("주소: " + address);

    } // main 메서드 끝
} // HelloJava 끝