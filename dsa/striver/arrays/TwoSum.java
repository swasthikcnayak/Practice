package Practice.dsa.striver.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    class Pair{
        int first;
        int second;

        Pair(int i,int j){
            this.first =i;
            this.second=j;
        }
    }

    // uses sorting
    public int[] twoSum(int[] nums, int target) {
        List<Pair> li = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            li.add(new Pair(nums[i], i));
        }

        Collections.sort(li, (p1,p2)->{return p1.first - p2.first; });

        int i = 0;
        int j = li.size()-1;

        while(i<j){
            int sum = li.get(i).first + li.get(j).first;
            if(sum == target){
                return new int[]{li.get(i).second, li.get(j).second };
            }else if(target > sum){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{-1,-1};    
    }

    public int[] twoSumMap(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target-nums[i])};
            }else{
                map.put(nums[i], i);
            }
        } 
        return new int[]{-1, -1};
    }
}
