package algorithm.impleMentation.starPractice;

import java.util.Scanner;

public class StarPractice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

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



