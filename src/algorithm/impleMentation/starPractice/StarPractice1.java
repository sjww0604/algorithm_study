package algorithm.impleMentation.starPractice;

import java.util.Scanner;

public class StarPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 초기화 단계
        // 숫자형 입력값을 받아 정수 N에 저장
        int N = sc.nextInt();

        // 2. 반복문을 통한 출력예시 구현 및 결과 반환
        // 반복문 사용 -> 시간복잡도 : O(N)
        for (int i = 1; i <= N; i++) {
            System.out.println("*".repeat(i));
        }
    }
}



