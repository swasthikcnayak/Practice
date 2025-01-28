package Practice.dsa.striver.arrays;

import java.util.HashMap;
import java.util.Map;

public class LogestSubArrayWithSumK {
    // can use 2 pointer for 
    public static int longesSubarray2(int[] arr,int k){
        int i = 0;
        int ans = 0;
        int j = 0;
        int sum = 0;
        while(j<arr.length){
            sum += arr[j];
            if(sum == k){
                ans = Math.max(ans, j-i+1);
            }else if(sum > k){
                sum =sum - arr[i];
                i++;
            }
            j++;
        }
        return ans;
    }

    // this works for both positive and negative numbers
    
    public static int longestSubarray(int[] arr,int k){
        Map<Integer,Integer> map = new HashMap<>();
        int ans = -1;
        map.put(0, -1);
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(map.containsKey(sum-k)){
                ans = Math.max(ans, i - map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = new int[]{7 , 3, 4, 9, 1 ,3};
        int ans = longesSubarray2(arr, 13);
        System.out.println(ans);
    }
}
