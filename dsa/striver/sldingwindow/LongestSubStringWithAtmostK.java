package Practice.dsa.striver.sldingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithAtmostK {

    public static int kDistinctChars(int k, String str) {
        int max = 0;
        int i = 0;
        int j = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (; j < str.length(); j++) {
            char current = str.charAt(j);
            map.put(current, map.getOrDefault(current, 0) + 1);

            while (map.size() > k) {
                char c = str.charAt(i);
                int numberOfElement = map.get(c);
                if (numberOfElement == 1) {
                    map.remove(c);
                } else {
                    map.put(c, numberOfElement - 1);
                }
                i++;
            }
            max = Math.max(max, j - i + 1);
        }
        return max;
    }

}
