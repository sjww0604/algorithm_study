package algorithm.impleMentation.programmers.lv3;

public class Solution44 {
    class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            int wmax = 0;
            int hmax = 0;

            for (int[] size : sizes) {
                int w = Math.max(size[0], size[1]);
                int h = Math.min(size[0], size[1]);

                if (w > wmax) {
                    wmax = w;
                }
                if (h > hmax) {
                    hmax = h;
                }
            }
            answer = wmax * hmax;
            return answer;
        }
    }
}
