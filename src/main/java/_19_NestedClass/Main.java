package _19_NestedClass;

import _15_Abstract.Character;

public class Main {
    public static void main(String[] args) {
        // 중첩클래스
        /*
            1. 메서드 안에서 class 선언 - 지역클래스
            -> 메서드 안에서만 클래스 역할 가능
            2. 익명 클래스
            3. 내부 클래스 - 일반내부, static내부(o)
         */

        // 익명클래스 - 추상체(추상클래스, 인터페이스)
        // -> 추상체로는 new가 불가능

        // Character를 상속받는 익명 클래스 정의와 동시에 생성까지
        // ch는 그럼 character 객체인가요?(x)
        // ch는 그냥 익명객체 - Character를 상속받았다.
        Character ch = new Character("익명", 99, 99) {
            private String a;
            private String b;
            
            @Override
            public void attack(Character target) {
                System.out.println("익명사용자 공격");
            }
        };

        System.out.println("익명 클래스의 진짜 이름은?");
        System.out.println(ch.getClass().getName());

    }
    Yes y = new Yes() {
        @Override
        public void yes() {
            System.out.println("넵!");
        }
    };
    y.yes();
}













