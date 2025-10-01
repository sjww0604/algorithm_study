package algorithm.impleMentation.starPractice;


import java.util.Scanner;

public class StarPractice12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. 초기화 단계
        // 값을 입력받고 저장할 변수 N 설정

        int N = sc.nextInt();

        // 2. 반복문 실행 및 구현 단계

        // 2.1 위쪽 for문 : 값이 증가함에 따라 오른쪽 정렬 기준 별을 증가시키는 반복문
        // 시간 복잡도 : 단일 for문 -> O(N)
            for (int i = 1; i <= N; i++) {
                System.out.println(" ".repeat(N - i) + "*".repeat(i));
            }

        // 2.1 아래쪽 for문 : 값이 감소함에 따라 오른쪽 정렬 기준 별을 감소시키는 반복문 ( 중복값을 피하기 위해 N-1을 초기값으로 설정 )
        // 시간 복잡도 : 단일 for문 -> O(N)
        for (int i = N - 1; i >= 1; i--) {
            System.out.println(" ".repeat(N - i) + "*".repeat(i));
        }
    }
        // 시간 복잡도 -> O(N) + O(N) = O(N)
}

