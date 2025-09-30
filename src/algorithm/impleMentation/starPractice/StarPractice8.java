package algorithm.impleMentation.starPractice;

import java.util.Scanner;

public class StarPractice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= (N-1); i++) {
            String stars = "*".repeat((i));

            int centerPad = (2 * (N-i));
            System.out.println(stars + " ".repeat(centerPad)+ stars);
        }
        int totalWidth = (2 * N);
        System.out.println("*".repeat(totalWidth));

        for (int j = N-1; j >= 1; j--) {
            String stars = "*".repeat((j));
            int centerPad = (2 * (N-j));
            System.out.println(stars + " ".repeat(centerPad) + stars);
        }
    }
}




