package algorithm.impleMentation.programmers.lv2;

public class Solution30 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            int mid = s.length() / 2;

            if (s.length() % 2 == 0) {
                answer = "" + s.charAt(mid-1) + s.charAt(mid);
            } else {
                answer ="" + s.charAt(mid);
            }
            return answer;
        }
    }
}
