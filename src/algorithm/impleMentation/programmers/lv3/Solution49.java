package algorithm.impleMentation.programmers.lv3;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution49 {
    class Solution {
        public int[] solution(int[] numbers) {

            Set<Integer> sums = new HashSet<>();
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    sums.add(numbers[i] + numbers[j]);
                }
            }

            int[] answer = sums.stream().mapToInt(Integer::intValue).toArray();
            Arrays.sort(answer);
            return answer;
        }
    }
}

