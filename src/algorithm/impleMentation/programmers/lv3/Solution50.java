package algorithm.impleMentation.programmers.lv3;

public class Solution50 {
    class Solution {
        public int[] solution(String s) {
            char[] chars = s.toCharArray();
            int[] answer = new int[chars.length];

            for (int i = 0; i < chars.length; i++) {
                answer[i] = -1;
                for (int j = i - 1; j >= 0; j--) {
                    if (chars[i] == chars[j]) {
                        answer[i] = i - j;
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
