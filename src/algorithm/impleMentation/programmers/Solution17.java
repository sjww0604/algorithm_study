package algorithm.impleMentation.programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution17 {
    public int[] solution(long n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add((int)(n % 10));
            n /= 10;
        }

        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
