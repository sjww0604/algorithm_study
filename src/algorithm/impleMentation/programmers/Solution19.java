package algorithm.impleMentation.programmers;

public class Solution19 {
    public long solution(long n) {
        long answer = 0;
        long sqrt = (long) Math.sqrt(n);
        if (sqrt * sqrt == n) {
            answer = (sqrt + 1) * (sqrt + 1);
        } else {
            answer = -1;
        }
        return answer;
    }
}
