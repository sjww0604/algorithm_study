package algorithm.impleMentation.programmers;

public class Solution15 {
    public int solution(int n) {
        int answer = 0;
        for (int x = n - 1; x >= 3; x--) {
            if (n % x == 1) {
                answer = x;
            }
        }
        return answer;
    }
}
