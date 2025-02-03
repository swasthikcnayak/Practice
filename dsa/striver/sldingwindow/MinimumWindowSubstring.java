package Practice.dsa.striver.sldingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int i = 0;
        int j = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int currentLength = 0;
        for (j = 0; j < s.length(); j++) {
            char current = s.charAt(j);
            if (map.containsKey(current)) {
                int value = map.get(current);
                map.put(current, value - 1);
                if (value > 0) {
                    currentLength++;
                }
            }
            while (currentLength == t.length()) {
                int length = j - i + 1;
                if (length < minLen) {
                    start = i;
                    minLen = length;
                }
                char c = s.charAt(i);
                if (map.containsKey(c)) {
                    int value = map.get(c);
                    map.put(c, value + 1);
                    if (value >= 0) {
                        currentLength--;
                    }
                }
                i++;
            }
        }
        if(minLen == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start, start+minLen);
    }
}
