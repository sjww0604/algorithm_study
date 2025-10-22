package algorithm.impleMentation.programmers;

public class Solution21 {
    class Solution {
        public boolean solution(int x) {
            boolean answer = true;
            String s = Integer.toString(x);
            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                result += s.charAt(i) - '0';
            }
            if (x % result == 0) {
                return answer;
            } else {
                answer = false;
            }
            return answer;
        }
    }
}
