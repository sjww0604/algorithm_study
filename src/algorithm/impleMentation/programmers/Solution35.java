package algorithm.impleMentation.programmers;

public class Solution35 {
    class Solution {
        public long solution(int price, int money, int count) {
            long answer = -1;
            answer = (long) price * count * (count + 1) / 2;

            long diff = answer - money;

            return diff > 0 ? diff : 0;
        }
    }
}
