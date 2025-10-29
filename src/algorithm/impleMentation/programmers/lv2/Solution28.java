package algorithm.impleMentation.programmers.lv2;

import java.util.Arrays;

public class Solution28 {
    class Solution {
        public int solution(int[] numbers) {
            int answer = -1;
            int max = 9;
            int checksum = 0;
            for (int i = 0; i <= max; i++) {
                checksum += i;
            }

            int sum = Arrays.stream(numbers).sum();
            answer = checksum - sum;
            return answer;
        }
    }
}
