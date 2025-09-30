package algorithm.impleMentation.starPractice;

import java.util.Scanner;

public class Main {
    static char[][] board;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

         board = new char[N][N];

         // 1. 공백으로 초기화
         for (int i = 0; i < N; i++) {
             for (int j = 0; j < N; j++) {
                board[i][j] = ' ';
             }
         }

         // 2. 재귀 호출 시작
        draw(0,0, N);

        // 3. 출력 (2차원배열형태로 출력 시 시간 초과 이슈 발생)
        for (int i = 0; i < N; i++) {
            System.out.println(new String(board[i])); // 행을 통째로 출력
        }
    }

    static void draw(int x, int y, int size) {
        if (size == 1) {
            board[x][y] = '*';
            return;
        }

        int newSize = size / 3;
        for (int dx = 0; dx < 3; dx++) {
            for (int dy = 0; dy < 3; dy++) {
                if (dx ==1 && dy ==1) continue;
                draw(x +dx * newSize, y + dy * newSize, newSize);
            }
        }
    }
}