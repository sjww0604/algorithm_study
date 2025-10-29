package algorithm.impleMentation.programmers.lv2;

public class Solution39 {
    class Solution {
        public int[] solution(int n, int m) {
            int[] answer = {};
            if (n == 0 && m == 0) {
                throw new IllegalArgumentException("0과 0의 최대공약수는 정의되지 않습니다.");
            }

            int gcd = getGcd(n, m);
            int lcm = n *  m / gcd;

            return answer = new int[]{gcd, lcm};
        }

        private int getGcd(int a, int b) {
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            return a;
        }
    }
}
