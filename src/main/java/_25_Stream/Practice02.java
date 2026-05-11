package _25_Stream;

import java.util.Arrays;
import java.util.List;

public class Practice02 {
    public static void main(String[] args) {
        // 데이터 베이스에서 가져왔다고 가정
        // bit.ly/koreait-web
        List<Product> products = Arrays.asList(
                new Product(1, "삼성 갤럭시북", true, 5, 2000000),
                new Product(2, "애플 m1", false, 1, 1590000),
                new Product(3, "삼성 키보드", true, 10, 40000),
                new Product(4, "애플 펜슬", true, 3, 190000),
                new Product(5, "로지텍 마우스", false, 0, 60000)
        );

        // 1. 이름에 삼성이 들어간 상품 중 10만원 이하 리스트로 추출
        List<Product> result1 = products.stream()
                .filter(p -> p.getProductName().contains("삼성")/*&& p.getPrice() <= 100000*/) // 효율 면에서는 &&이 좋으나 유지보수측면에서는 filter를 두 번 나누는게 좋음
                .filter(p -> p.getPrice() <= 100000)
                .toList();
        System.out.println(result1);

        // 2. 이름에 애플이 들어가지 않은 상품 중
        // 세일중인 상품을 리스트로 추출
        // 단, 세일일 경우, 정가 * 0.9해서 추출해 주세요.

        List<Product> result2 = products.stream()
                .filter(p -> !p.getProductName().contains("애플"))
                // 메서드 참조(레퍼런스)
                // 람다식 축약버전. 클래스명 :: 메서드명 or 객체명 :: 메서드명
                // a -> System.out.println(a)
                // System.out::println
                // 받아서 그대로 메서드만 호출하는 경우 사용.
                .filter(Product::isOnSale) // 인스턴스메서드의 메서드 참조
//                .map(p -> {
//                    return new Product(p.getProductId(), p.getProductName(), p.isOnSale(), p. getStock(), (int) (p.getPrice() * 0.9));
//                })
                .map(Product::toSalePrice) // 인스턴스 메서드의 참조
                .toList();
        System.out.println(result2);

        // 3. 상품들을 가격 내림차순으로 정렬한 리스트
        List<Product> result3 = products.stream()
                // Comparator라는 인터페이스를 받음
                .sorted((n1, n2) -> n2.getPrice() - n1.getPrice())
                .toList();
        System.out.println(result3);

        // 4. 세일중인 상품들의 총 가치(재고 * 가격) 계산해서 출력
        // List<Product> -> List<Integer> -> Integer
        int totalValue = products.stream()
                .filter(Product::isOnSale)
                .map(p -> p.getPrice() * p.getStock())
                .reduce(0, (sum, value) -> sum + value);
        System.out.println("현재 재고가치: " + totalValue);

    }
}
