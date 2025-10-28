package algorithm.impleMentation.programmers;

public class Solution40 {
    class Solution {
        public int solution(int n) {
            int answer = 0;

            // 3진법으로 치환
            String convert = Integer.toString(n, 3);
            String reversed = new StringBuilder(convert).reverse().toString();

            // 10진법으로 치환
            answer = Integer.parseInt(reversed, 3);

            return answer;
        }
    }
}
