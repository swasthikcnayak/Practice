package Practice.dsa.striver.binarysearch.bsOnAnswer;

public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {
        int i = 0;
        int j = (int)1e9;
        int ans = -1;
        while(i<=j){
            int mid = i + (j-i)/2;

            boolean possible = getSubArrayPossible(nums, k, mid);
            if(possible){
                ans = mid;
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return ans;
    }

    public boolean getSubArrayPossible(int[] nums, int k,int maxSum){
        int currSum = 0;
        int parts = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > maxSum){
                return false;
            }
            currSum += nums[i];
            if(currSum > maxSum){
                parts++;
                currSum = nums[i];
            }
        }
        return parts<=k;
    }
}