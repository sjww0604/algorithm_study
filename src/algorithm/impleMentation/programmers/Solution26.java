package algorithm.impleMentation.programmers;

public class Solution26 {
    class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
            for (int i = 0; i < signs.length; i++) {
                if (signs[i]) {
                    absolutes[i] = Math.abs(absolutes[i]);
                } else {
                    absolutes[i] = -Math.abs(absolutes[i]);
                }
            }

            for (int absolute : absolutes) {
                answer += absolute;
            }

            return answer;
        }
    }
}
