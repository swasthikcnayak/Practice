package Practice.dsa.striver.binarysearch;

public class SearchInRotatedSortedArray {
    // works only for unique values
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while(i<=j){
            int mid = i + (j-i)/2;

            if(nums[mid]>=nums[i]){
                if(nums[mid] == target){
                    return mid;
                }else if(target>=nums[i] && target<=nums[mid]){
                    j = mid - 1;
                }else{
                    i = mid + 1;
                }
            }else{
                if(nums[mid] == target){
                    return mid;
                }else if(target >= nums[mid] && target <= nums[j]){
                    i = mid + 1;
                }else{
                    j = mid - 1;
                }
            }
        }
                    return -1;
    }
}