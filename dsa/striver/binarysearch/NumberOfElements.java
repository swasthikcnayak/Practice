package Practice.dsa.striver.binarysearch;

public class NumberOfElements {
    // count of elements having the target in sorted array
    public static int count(int nums[], int n, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        int i = 0;
        int j = nums.length - 1;

        while(i<=j){
            int mid = i + (j-i)/2;

            if(nums[mid] == target){
                ans[0] = mid;
                j = mid - 1;
            }else if(target > nums[mid]){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        i  = 0;
        j = nums.length - 1;

        while(i<=j){
            int mid = i + (j-i)/2;
            if(target == nums[mid]){
                ans[1] = mid;
                i = mid + 1;
            }else if(target > nums[mid]){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        if(ans[0] == -1){
            return 0;
        }
        return ans[1] - ans[0] + 1;
    }
}