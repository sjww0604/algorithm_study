package algorithm.impleMentation.programmers.lv1;

// 머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 2022년 기준 선생님의 나이 age가 주어질 때, 선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요
public class Solution4 {
    public int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1; //태어난 연도가 1살이므로 +1 필요
        return answer;
    }
}
