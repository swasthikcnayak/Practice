package Practice.dsa.striver.arrays;

/**
 * 26. Remove Duplicates from Sorted Array
https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
public class RemoveDuplicateSortedArray {
    public int removeDuplicates(int[] nums) {
        int idx = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[idx]){
                idx++;
                nums[idx] = nums[i];
            }
        }
        return idx+1;
    }
}
