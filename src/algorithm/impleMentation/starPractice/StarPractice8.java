package algorithm.impleMentation.starPractice;

import java.util.Scanner;

public class StarPractice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 초기화 단계
        // 1.1 값을 입력받아 처리할 정수형 타입 변수 N 선언
        int N = sc.nextInt();

        // 2. 반복문 실행 및 결과값 반환
        // 시간복잡도 : 단일 반복문 2개 사용 -> O(N) + O(N) = O(N)
        for (int i = 1; i <= (N-1); i++) {
            String stars = "*".repeat((i));

            int centerPad = (2 * (N-i));
            System.out.println(stars + " ".repeat(centerPad)+ stars);
        }
        int totalWidth = (2 * N);
        System.out.println("*".repeat(totalWidth));

        for (int j = N-1; j >= 1; j--) {
            String stars = "*".repeat((j));
            int centerPad = (2 * (N-j));
            System.out.println(stars + " ".repeat(centerPad) + stars);
        }
    }
}




