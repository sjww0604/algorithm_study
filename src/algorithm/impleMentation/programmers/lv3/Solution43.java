package algorithm.impleMentation.programmers.lv3;

public class Solution43 {
    class Solution {
        public int solution(String t, String p) {
            int answer = 0;
            int n = t.length();
            int m = p.length();
            if (n < m) return 0;

            int count = 0;
            for (int i = 0; i <= n - m; i++) {
                String part = t.substring(i, i + m);
                if (part.compareTo(p) <= 0) {
                    count++;
                }
            }
            answer = count;
            return answer;
        }
    }
}
