package algorithm.impleMentation.programmers.lv1;

public class Solution10 {
        public double solution(int[] numbers) {
            double answer = 0;
            for (int i = 0; i < numbers.length; i++) {
                answer += numbers[i];
            }
            answer = answer / numbers.length;
            return answer;
        }
    }
