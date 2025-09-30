package algorithm.impleMentation.starPractice;

import java.util.Scanner;

public class StarPractice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 초기화 단계
        // 1.1 입력값을 받아 처리할 N 선언
        int N = sc.nextInt();

        // 2. 반복문 실행 및 결과 반환
        // 시간복잡도 : 단일 반복문 실행 -> O(N)
        for (int i = N; i >= 1; i--) {
            int j = (2 * i - 1);
            int totalWidth = (2 * N - 1);
            String stars = "*".repeat(j);
            int leftPad = (totalWidth - stars.length()) / 2;
            System.out.println(" ".repeat(leftPad) + stars);
        }
    }
}


