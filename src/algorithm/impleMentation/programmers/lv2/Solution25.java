package algorithm.impleMentation.programmers.lv2;


import java.util.Arrays;

public class Solution25 {
    class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] answer = {};
            int count = 0; // answer 배열길이를 정해주기 위한 arr 내에 해당되는 값 개수 찾기
            for (int v : arr) {
                if (v % divisor == 0) {
                    count++;
                }
            }

            if (count == 0) {
                return new int[]{-1};
            }
            answer = new int[count];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    answer[index] = arr[i];
                    index++;
                }
            }

            Arrays.sort(answer);

            return answer;
        }
    }
}
