package algorithm.impleMentation.starPractice;

import java.util.Scanner;

public class StarPractice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 초기화 단계
        // 1.1 정수형 타입의 입력을 받을 변수 N 선언
        // 1.2 입력값에 따른 전체 넓이를 정수형으로 저장
        int N = sc.nextInt();
        int totalWidth = 2*N;

        // 2. 반복문 실행 및 결과 반환 단계

        // 위쪽 for문 : i = 1 ~ N-1 -> O(N)
        for (int i = N - 1; i >= 1; i--) {
            String stars = "*".repeat((2 * i + 1));
            int bothPad = (totalWidth - stars.length()) / 2;
            System.out.println((" ".repeat(bothPad) + stars));
        }

        // 아래쪽 for문 : j = 1 ~ N -> O(N)
        for (int j = 1; j <= N; j++) {
            String stars = "*".repeat((2 * j - 1));
            int bothPad = (totalWidth - stars.length()) / 2;
            System.out.println((" ".repeat(bothPad) + stars));
        }
        // 시간복잡도 : 반복문 2개 실행 -> O(N) + O(N) = O(N)

    }
}