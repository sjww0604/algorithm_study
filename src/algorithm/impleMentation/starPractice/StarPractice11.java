package algorithm.impleMentation.starPractice;

import java.util.Scanner;

public class StarPractice11 {
    static char[][] board;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();

            /* 1. 초기화 단계
            * 정삼각형을 가운데 정렬로 그리기 위해 가로폭을 2N-1로 설정
            * 예) N=3 -> 가로 5칸, N=6 -> 가로 11칸 */
            board = new char[N][2*N -1];

            // 1.1 캔버스 전체를 공백으로 초기화 (기본 바탕)
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < (2 * N - 1); j++) {
                    board[i][j] = ' ';
                }
            }
            /* N은 항상 3×2^k 수이다. (3, 6, 12, 24, 48, ...) (0 ≤ k ≤ 10, k는 정수)
            * 그리기 시작: 정점(멛ㅌ)을 중앙 열에 맞춰 시작
            * 시작 좌표 : (x=0, y=(2N-1)/2) */
            draw(0, (2 * N - 1) / 2, N);

            // 3) 출력: 각 행(char[])을 문자열로 변환하여 라인 단위로 출력
            //    - new String(board[i])는 i번째 행의 char[]를 그대로 이어붙여 문자열을 만든다.
            for (int i = 0; i < N; i++) {
                System.out.println(new String(board[i]));
            }

        }
        /*
        * 크기 'size'의 정삼각형을 (x, y)를 꼭짓점으로 하여 그린다.
        *
        * @param x    꼭짓점의 행 인덱스 (0이 최상단)
        * @param y    꼭짓점의 열 인덱스 (가운데 정렬 기준)
        * @param size 삼각형 높이 (3 × 2^k 형태여야 함)
        *
        * 전제조건:
        *  - 0 ≤ x &lt; N, 0 ≤ y &lt; 2N-1
        *  - size == 3일 때의 베이스 패턴은 다음과 같다 (x는 행, y는 열):
        *        board[x][y]         = '*'
        *        board[x+1][y-1]     = '*',   board[x+1][y+1] = '*'
        *        board[x+2][y+2..y+2] = '*****'
        *
        * 재귀 분할:
        *  - 위 삼각형(top):             (x,        y,        size/2)
         *  - 왼아래 삼각형(bottom-left):  (x+size/2, y-size/2, size/2)
        *  - 오른아래 삼각형(bottom-right):(x+size/2, y+size/2, size/2)
        */
        static void draw(int x, int y, int size) {
            if (size == 3) {
                board[x][y] = '*';                  // 꼭대기 정점 (top apex)
                board[x + 1][y - 1] = '*';          // 2번째 줄 왼쪽 대각
                board[x + 1][y + 1] = '*';          // 2번째 줄 오른쪽 대각
                for (int k = -2; k <= 2; k++) {     // 바닥 라인 ***** (폭 5)
                    board[x + 2][y + k] = '*';
                }
                return;
            }
            int half = size / 2;
            draw(x, y, half);                       // 상단(top)
            draw(x + half, y - half, half);   // 좌하단(bottom-left)
            draw(x + half, y + half, half);   // 우하단(bottom-right)
        }
}