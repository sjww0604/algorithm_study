package algorithm.impleMentation.programmers.lv2;

public class Solution23 {
    class Solution {
        public int solution(int num) {
            int answer = 0;
            long n = num;

            if (n == 1) {
                return answer;
            }

            for (int i = 1; i <= 500; i++) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = n * 3 + 1;
                }
                if (n == 1) {
                    return answer = i;
                }
            }
            return answer = -1;
        }
    }
}

