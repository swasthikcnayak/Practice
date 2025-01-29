package Practice.dsa.striver.arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementTwo {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = Integer.MAX_VALUE;
        int candidate2 = Integer.MAX_VALUE - 1;
        int c1 = 0;
        int c2 = 0;
        for(int value : nums){
            if(value == candidate1){
                c1++;
            }else if(value == candidate2){
                c2++;
            }else if(c1 == 0){
                c1=1;candidate1 = value;
            }else if(c2==0){
                c2=1;candidate2=value;
            }else{
                c1--;c2--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        c1 = 0;
        c2 = 0;

        for(int value: nums){
            if(value == candidate1){
                c1++;
            }else if(value == candidate2){
                c2++;
            }
        }
        int n = nums.length;
        if(c1>n/3){
            ans.add(candidate1);
        }
        if(c2>n/3){
            ans.add(candidate2);
        }
        return ans;
    }
}