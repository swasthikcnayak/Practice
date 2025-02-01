package Practice.dsa.striver.binarysearch;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int ans = nums.length;
        int i = 0;
        int j = nums.length - 1;

        while(i<=j){
            int mid = i + (j-i)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                ans = mid;
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return ans;
    }
}