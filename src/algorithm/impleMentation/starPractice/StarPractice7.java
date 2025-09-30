package algorithm.impleMentation.starPractice;

import java.util.Scanner;

public class StarPractice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 초기화 단계
        // 1.1 값을 입력받아 처리할 정수형 변수 N 선언
        int N = sc.nextInt();

        // 2. 반복문 실행 및 결과 반환
        // 시간 복잡도 : 단일 반복문 2개 진행 O(N) + O(N) = O(N)
        for (int i = 1; i <= N; i++) {
            String stars = "*".repeat((2 * i - 1));
            int totalWidth = (2 * N - 1);
            int leftPad = (totalWidth - stars.length()) / 2;
            System.out.println(" ".repeat(leftPad)+ stars);
            }
        for (int j = N-1; j >= 1; j--) {
            String stars = "*".repeat((2*j-1));
            int totalWidth = (2 * N - 1);
            int leftPad = (totalWidth - stars.length()) / 2;
            System.out.println(" ".repeat(leftPad) + stars);
        }
    }
}



