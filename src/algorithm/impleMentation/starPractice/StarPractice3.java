package algorithm.impleMentation.starPractice;

import java.util.Scanner;

public class StarPractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 초기화 단계
        // 1.1 입력값을 받을 변수 N 선언
        int N = sc.nextInt();

        // 2. 반복문 실행 및 결과 반환 과정
        // 시간복잡도 : 반복문 사용 O(N)
        for (int i = N; i >= 1; i--) {
            String stars = "*".repeat(i);
            System.out.println(stars);

        }
    }
}



