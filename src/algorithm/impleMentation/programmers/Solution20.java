package algorithm.impleMentation.programmers;

import java.util.Arrays;

public class Solution20 {
    class Solution {
        public long solution(long n) {
            long answer = 0;

            // 정수를 문자열로 변환
            char[] chars = String.valueOf(n).toCharArray();

            Arrays.sort(chars); // 오름차순 정렬
            StringBuilder sb = new StringBuilder(new String(chars));
            sb.reverse(); // 내림차순으로 변경

            answer = Long.parseLong(sb.toString()); // 문자열을 숫자로 변환

            return answer;
        }
    }
}
