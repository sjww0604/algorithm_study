package algorithm.impleMentation.starPractice;

import java.util.Scanner;

public class StarPractice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 초기화 단계
        // 1.1 값을 입력받을 정수형 타입 변수 N 선언
        int N = sc.nextInt();

        // 2. 반복문 실행 및 결과 반환
        // 시간복잡도 : 반복문 실행 -> O(N)
        for (int i = 1; i <= N; i++) {
            int j = (2 * i - 1);
            int totalWidth = (2 * N - 1);
            String stars = "*".repeat(j);
            int leftPad = (totalWidth - stars.length()) / 2;
            System.out.println(" ".repeat(leftPad) + stars);
        }
    }
}


