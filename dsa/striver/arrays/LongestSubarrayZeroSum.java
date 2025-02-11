package Practice.dsa.striver.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayZeroSum {
    int maxLen(int arr[]) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int maxLen = 0;
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            
             if(map.containsKey(sum)){
                 maxLen = Math.max(maxLen, i - map.get(sum));
             }else{
                 map.put(sum, i);
             }
        }
        return maxLen;
    }
}