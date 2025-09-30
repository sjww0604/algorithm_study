package algorithm.impleMentation.starPractice;

import java.util.Scanner;

public class StarPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 초기화 단계
        // 숫자형 입력값을 받아 정수 N에 저장
        int N = sc.nextInt();

        // 2. 반복문을 통한 *을 문자열로 저장
        for (int i = 1; i <= N; i++) {
            String stars = "*".repeat(i);
            System.out.println(String.format("%" + N + "s", stars));
        }
    }
}



