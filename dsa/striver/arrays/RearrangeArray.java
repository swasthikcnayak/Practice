package Practice.dsa.striver.arrays;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArray {

/**
 * Positive and negative count need not be same
 * @param nums
 * @return
 */
    public static int[] rearrange2(int[] nums){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int i: nums){
            if(i>0){
                pos.add(i);
            }else{
                neg.add(i);
            }
        }
        int i = 0;
            for(int k=0;k<Math.min(neg.size(), pos.size());k++){
                    nums[i] = pos.get(k);
                    nums[i+1] = neg.get(k);
                    i+=2;
            }
            if(neg.size() > pos.size()){
                for(int k=pos.size(); k<neg.size();k++){
                    nums[i] = neg.get(k);
                    i++;
                }
            }
            if(pos.size() > neg.size()){
                for(int k=neg.size(); k<pos.size();k++){
                    nums[i] = pos.get(k);
                    i++;
                }
            }
            return nums;
    }

    /**
     * Regarrange array such that all the postive and negative are alternate
     * Always positive first
     * Postive and Negative count is same
     * 
     * @param nums
     * @return
     */
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j = 1;

        for (int t : nums) {
            if (t > 0) {
                ans[i] = t;
                i += 2;
            } else {
                ans[j] = t;
                j += 2;
            }
        }

        return ans;
    }


    public static void main(String[] args){
        int[] arr = new int[]{-3 ,1, 7, -2, 11, 50};
        int[] ans = rearrange2(arr);
        for(int i: ans){
            System.out.println(i);
        }
    }
}
