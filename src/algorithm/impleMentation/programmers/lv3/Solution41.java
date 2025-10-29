package algorithm.impleMentation.programmers.lv3;

public class Solution41 {
    class Solution {
        public String solution(String s) {
            StringBuilder answer = new StringBuilder();
            /* 접근 설계
            * 공백별로 단어를 구분
            * 구분된 단어를 각 문자열로 저장 및 문자열의 길이 측정
            * 홀수 / 짝수의 상태에 따라 대문자, 소문자로 저장하도록 설계
            * 단, 첫번째 글자는 0번째 인덱스로 판단하여 짝수번째 알파벳으로 처리(고정) */
            String[] words = s.split(" ", -1);

            for (int w = 0; w < words.length; w++) {
                String word = words[w];
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    if ( i % 2 == 0) {
                        answer.append(Character.toUpperCase(c));
                    } else {
                        answer.append(Character.toLowerCase(c));
                    }
                }
                if (w < words.length - 1) {
                    answer.append(" ");
                }
            }
            return answer.toString();
        }
    }
}
