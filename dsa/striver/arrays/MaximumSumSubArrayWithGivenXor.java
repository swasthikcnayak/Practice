package Practice.dsa.striver.arrays;

import java.util.HashMap;
import java.util.Map;

public class MaximumSumSubArrayWithGivenXor {
    public int solve(int[] arr, int find) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int runingXor = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            runingXor = runingXor ^ value;
            int toFind = runingXor ^ find;
            if (map.containsKey(toFind)) {
                ans += map.get(toFind);
            } 
            map.put(runingXor, map.getOrDefault(runingXor, 0) +1);
        }
        return ans;
    }
}
