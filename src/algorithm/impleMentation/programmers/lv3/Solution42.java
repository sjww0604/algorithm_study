package algorithm.impleMentation.programmers.lv3;

public class Solution42 {
    class Solution {
        public int solution(int[] number) {
            int answer = 0;
            int count = 0;
            for (int i = 0; i < number.length; i++) {
                for (int j = i + 1; j < number.length; j++) {
                    for (int k = j + 1; k < number.length; k++) {
                        if(number[i] + number[j] + number[k] == 0) {
                            count++;
                        }
                    }
                }
            }
            answer = count;
            return answer;
        }
    }
}
