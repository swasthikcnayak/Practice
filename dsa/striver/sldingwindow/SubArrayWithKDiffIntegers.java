package Practice.dsa.striver.sldingwindow;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithKDiffIntegers {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int kcount = lteqK(nums, k);
        int kcountp = lteqK(nums, k-1);
        return kcount - kcountp;
    }

    public int lteqK(int[] nums,int k){
        int count = 0;
        int i = 0;
        int j = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(j=0;j<nums.length;j++){
            int value = nums[j];
            map.put(value,map.getOrDefault(value,0)+1);

            while(map.size() >k){
                int pvalue = nums[i];
                int pcount = map.get(pvalue);
                if(pcount == 1){
                    map.remove(pvalue);
                }else{
                    map.put(pvalue, pcount -1);
                }
                i++;
            }
            count += (j-i+1);
        }
        return count;
    }
}
