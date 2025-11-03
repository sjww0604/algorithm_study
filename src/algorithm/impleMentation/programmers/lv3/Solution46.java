package algorithm.impleMentation.programmers.lv3;

import java.util.HashMap;
import java.util.Map;

public class Solution46 {
    class Solution {
        public int solution(String s) {
            int answer = 0;
            Map<String, Integer> map = new HashMap<>();
            map.put("zero", 0);
            map.put("one", 1);
            map.put("two", 2);
            map.put("three", 3);
            map.put("four", 4);
            map.put("five", 5);
            map.put("six", 6);
            map.put("seven", 7);
            map.put("eight", 8);
            map.put("nine", 9);

            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < s.length()) {
                char c = s.charAt(i);
                if (Character.isDigit(c)) {
                    sb.append(c);
                    i++;
                } else {
                    boolean matched = false;
                    for (int len = 5; len >= 3; len--) {
                        if (i + len <= s.length()) {
                            String sub = s.substring(i, i + len);
                            if (map.containsKey(sub)) {
                                sb.append(map.get(sub));
                                i += len;
                                matched = true;
                                break;
                            }
                        }
                    }
                    if (!matched) {
                        i++;
                    }
                }
            }
            return answer = Integer.parseInt(sb.toString());
        }
    }
}