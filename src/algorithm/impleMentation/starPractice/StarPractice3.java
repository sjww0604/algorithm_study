package algorithm.impleMentation.starPractice;

import java.util.Scanner;

public class StarPractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = N; i >= 1; i--) {
            String stars = "*".repeat(i);
            System.out.println(stars);

        }
    }
}



