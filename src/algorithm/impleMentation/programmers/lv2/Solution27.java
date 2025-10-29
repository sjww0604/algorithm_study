package algorithm.impleMentation.programmers.lv2;

public class Solution27 {
    class Solution {
        public String solution(String phone_number) {
            String answer = "";
            int length = phone_number.length();
            answer = "*".repeat(length-4) + phone_number.substring(length-4);

            return answer;
        }
    }
}
