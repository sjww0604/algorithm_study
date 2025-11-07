package algorithm.impleMentation.programmers.lv3;

import java.util.Arrays;

public class Solution48 {
    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            int idx = 0;

            for (int[] command : commands) {
                int i = command[0];
                int j = command[1];
                int k = command[2];

                int[] slice = new int[j - i + 1];
                for (int x = 0; x < slice.length; x++) {
                    slice[x] = array[(i - 1) + x];
                }

                Arrays.sort(slice);
                answer[idx++] = slice[k - 1];
            }

            return answer;
        }
    }
}
