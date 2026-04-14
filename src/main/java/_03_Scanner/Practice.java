package _03_Scanner;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 페이지네이션
        // 스캐너를 통해 게시글 갯수를 입력받으세요
        System.out.print("게시글 갯수를 입력하세요 > ");
        int postCount;
        int viewCount = 20; // 한 페이지당 보여주는 게시글 수
        // 총 페이지의 갯수를 구하여 출력해주세요.
        int pageCount;
        postCount = scanner.nextInt(); scanner.nextLine();
//        pageCount = postCount / viewCount;
//        if (postCount % viewCount > 0) pageCount++;
        pageCount = postCount % viewCount == 0 ? postCount / viewCount
                                                : postCount / viewCount + 1;

        System.out.println(pageCount);

    }

}
