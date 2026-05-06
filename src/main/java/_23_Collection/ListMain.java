package _23_Collection;

import java.util.ArrayList;
import java.util.List;

// 제너릭 -> 컬렉션자료형 -> 람다 -> stream API
public class ListMain {
    public static void main(String[] args) {
        // List는 인터페이스
        // 여러가지 구현체 존재 - ArrayList, LinkedList
        // ArrayList - 배열단점 극복(크기 고정, 중간에 null 가능)
        // 동적으로 크기가 늘어남. 중간 삽입, 삭제에 대해 정렬수행
        List<Integer> numList = new ArrayList<>(); // 캐스팅
        List<Integer> numList2 = new ArrayList<>();
        // 추가, 조회, 업데이트, 삭제

        // 추가
        numList.add(100);
        numList.add(0, 90); // index 지정해서 추가
        numList.add(110);
        numList2.addAll(numList); // 여러개 한번에 추가

        // 조회
        Integer Idx0 = numList.get(0); // nums[0]
        boolean has110 = numList.contains(110); // 110이라는 값이 있는가?
        System.out.println(numList); // toString() 이미 오버라이딩 되어있음.

        // list와 for문
        // 배열의 길이는 빈공간도 포함
        // 리스트의 사이즈는 실제 들어가있는 데이터만 카운트
        for(int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));
        }

        for(Integer num : numList) {
            System.out.println(num);
        }

        // 업데이트
        numList.set(0, 999); // index, 데이터

        // 제거
        numList.remove(1); // 인덱스 삭제
        numList.remove((Object) 999); // 값으로 삭제
        System.out.println(numList);

        // 불변리스트 생성 - 조회전용
        // 한 번 생성하면 조회만 가능
        List<String> abc = List.of("a", "b", "c");


        List<Integer> scores = List.of(85, 92, 78, 96, 88);
        // 총 점수합, 평균, 최고점수 출력해주세요!
        int sum = 0;
        double avg = 0.0;
        int max = 0;
        for (Integer score: scores) {
            sum += score;
            if (score > max) {
                max = score;
            }
        }
        avg = (double) sum / scores.size();
        System.out.println("총점수합: " + sum);
        System.out.println("평균: " + avg);
        System.out.println("최고점수: " + max);

    }
}
