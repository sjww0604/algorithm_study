package algorithm.impleMentation.starPractice;

import java.util.Scanner;

public class StarPractice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int totalWidth = 2*N;

        for (int i = N - 1; i >= 1; i--) {
            String stars = "*".repeat((2 * i + 1));
            int bothPad = (totalWidth - stars.length()) / 2;
            System.out.println((" ".repeat(bothPad) + stars));
        }
        for (int j = 1; j <= N; j++) {
            String stars = "*".repeat((2 * j - 1));
            int bothPad = (totalWidth - stars.length()) / 2;
            System.out.println((" ".repeat(bothPad) + stars));
        }
    }
}