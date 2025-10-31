package algorithm.impleMentation.programmers.lv3;

public class Solution45 {
    class Solution {
        public String solution(String s, int n) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    c = (char) ('A' + (c - 'A' + n) % 26);
                } else if (c >= 'a' && c <= 'z') {
                    c =  (char) ('a' + (c - 'a' + n) % 26);
                }
                sb.append(c);
            }
            return sb.toString();
        }
    }
}
