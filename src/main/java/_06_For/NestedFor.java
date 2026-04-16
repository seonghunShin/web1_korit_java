package _06_For;

public class NestedFor {

    public static void main(String[] args) {

        // 2중 for문

        // 일주일
        for (int day = 1; day <= 7; day++) {
            System.out.println(day + "일 살았습니다.");
        }
        System.out.println("----------------------------------");

        // 한 달
        // 바깥 반복이 한 번 돌 때, 안 쪽 반복은 전체 반복.
        for (int week = 1; week <= 4; week++) {
            System.out.println(week + "주 시작");
            for (int day = 1; day <= 7; day++) {
                System.out.println(week + "주 " + day + "일 살았습니다.");
            }
            System.out.println(week + "주 끝");
        }

        // 구구단
        // 2단 출력
        /*
            2단 시작!
                2 x 1 = 2
                .
                .
                .
                2 x 9 = 18
            2단 끝!
         */
        System.out.println("2단 시작!");
        for (int i = 1; i <= 9; i++) {
            System.out.println("    2 x " + i + " = " + i * 2);
        }
        System.out.println("2단 끝!");
        System.out.println("--------------------------------");

        // 구구단 전체
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단 시작!");
            for (int j = 1; j <= 9; j++) {
                System.out.println("    " + i + " x " + j + " = " + i * j);
            }
            System.out.println(i + "단 끝!\n");
        }

    }

}
