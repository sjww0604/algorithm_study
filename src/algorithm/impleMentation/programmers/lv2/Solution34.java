package algorithm.impleMentation.programmers.lv2;

import java.util.Arrays;

public class Solution34 {
    class Solution {
        public String solution(String s) {
            String str = s.toString();

            char [] arr = str.toCharArray();
            Arrays.sort(arr);
            StringBuilder answer = new StringBuilder(new String(arr));
            answer.reverse();

            return answer.toString();
        }
    }
}
