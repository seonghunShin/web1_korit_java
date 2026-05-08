package _25_Stream;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream02 {
    public static void main(String[] args) {
        // 정렬
        List<Integer> nums = Arrays.asList(1, 10, 5, 3, 2, 10);
        List<Integer> sortedNums = nums.stream()
                // 버전마다 각자 다른 정렬 알고리즘 구현되어있음.

                // 기준: 오름차순일 때
                // n1 - n2을 리턴하면 오름차순(기본구현)
                // n2 - n1을 리턴하면 내림차순
                .sorted((n1, n2) -> n2 - n1)
                .toList();
        System.out.println(sortedNums);

        @Data
        class Person{
            private final String name;
            private final int age;
        }

        List<Person> people = Arrays.asList(
                new Person("김하나", 25),
                new Person("김둘", 16),
                new Person("김셋", 37)
        );

        List<Person> orderedPeople = people.stream()
                .sorted((p1, p2) -> p2.getAge() - p1.getAge())
                .toList();

        // 참고) 다양한 중간연산자
        // distinct() - 중복제거 (객체의 경우, equals 비교)
        // limit(갯수) - 갯수제한
        nums.stream()
                .distinct() // 중복이 모두 제거됨.
                .sorted((n1, n2) -> n2 - n1)
                .limit(1)
                .forEach(n -> System.out.println(n));

        // 참고) reduce (최종연산) - 누적합
        // stream은 외부 변수 개입이 x
        // reduce(누적변수 초기값, (누적 할 변수, 리스트 요소) -> 연산식)
//        int sum = 0;
//        nums.stream()
//                .forEach(n -> {
//                    sum += n; // 외부 변수 사용이 막혀있음.
//                });

        int total = nums.stream()
                .reduce(0, (sum, n) -> {
                    return sum + n; // 리턴되면 다음 sum의 초기값으로 들어감
                });
        System.out.println(total);

        // people의 있는 person객체들의 나이들의 총합을
        // reduce로 구해주세요
        int ageSum = people.stream()
                .map(p -> p.getAge()) // reduce는 타입 변환 x
                .reduce(0, (sum, age) -> sum += age);
        System.out.println(ageSum);

        // 평탄화(참고)
        // [[1, 2], [3, 4], [5, 6]] -> [1, 2, 3, 4, 5, 6]
        // 이런건 DB가 못함.
        List<List<Integer>> lists = List.of(
                List.of(1,2),
                List.of(3,4),
                List.of(5,6)
        );

        // 객체를 매 반복마다 기억하는 것 -> 누적합
        List<Integer> result = lists.stream()
                .reduce(new ArrayList<>(), (acc, list) -> {
                    List<Integer> newList = new ArrayList<>(acc);
                    newList.addAll(list); // 하나씩 가져온 리스트 요소를 누적 값에 한번에 넣기
                    return newList;
                });
        System.out.println(result);

    }
}
