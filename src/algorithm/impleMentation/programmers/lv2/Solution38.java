package algorithm.impleMentation.programmers.lv2;

import java.util.Scanner;

public class Solution38 {
    class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            String s = "*";

            for (int i = 1; i <= b; i++) {
                System.out.println(s.repeat(a));
            }
        }
    }
}
