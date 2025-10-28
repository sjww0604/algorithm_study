package algorithm.impleMentation.programmers;

public class Solution37 {
    class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = {};
            if (arr1 == null || arr2 == null) {
                throw new IllegalArgumentException("null 배열");
            }

            if (arr1.length != arr2.length) {
                throw new IllegalArgumentException("행 수 다름");
            }

            int rows = arr1.length;
            answer = new int[rows][];

            for (int i = 0; i < rows; i++) {
                if (arr1[i] == null || arr2[i] == null) {
                    throw new IllegalArgumentException("null 행");
                }

                if (arr1[i].length != arr2[i].length) {
                    throw new IllegalArgumentException("열 수 다름");
                }

                int cols = arr1[i].length;
                answer[i] = new int[cols];

                for (int j = 0; j < cols; j++) {
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            return answer;
        }
    }
}
