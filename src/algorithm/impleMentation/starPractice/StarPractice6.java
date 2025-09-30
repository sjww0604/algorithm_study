package algorithm.impleMentation.starPractice;

import java.util.Scanner;

public class StarPractice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = N; i >= 1; i--) {
            int j = (2 * i - 1);
            int totalWidth = (2 * N - 1);
            String stars = "*".repeat(j);
            int leftPad = (totalWidth - stars.length()) / 2;
            System.out.println(" ".repeat(leftPad) + stars);
        }
    }
}


