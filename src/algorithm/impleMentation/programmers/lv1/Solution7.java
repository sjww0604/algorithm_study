package algorithm.impleMentation.programmers.lv1;

// 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 완성해주세요.
public class Solution7 {
    class Solution {
        public int solution(int num1, int num2) {
            double answer = 0;
            answer = (double) num1 / (double) num2 * 1000; //나눗셈 결과를 Double로 받아 * 1000 연산 시 정수부분이 출력되도록 구현
            return (int) answer;
        }
    }
}
