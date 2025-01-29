package Practice.dsa.striver.arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubarrayWithSumK {
   
     public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int ans = 0;
        for(int element: nums){
            sum += element;

            if(map.containsKey(sum - k)){
                ans += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
