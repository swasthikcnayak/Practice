package Practice.dsa.striver.binarysearch.bsOnAnswer;

public class SmallestDivisor {
    public int smallestDivisor(int[] nums, int threshold) {
        int i = 1;
        int j = (int)1e9;
        int ans = 1;
        while(i<=j){
            int mid =i + (j-i)/2;

            int s = sum(nums, mid);
            if(s<=threshold){
                ans = mid;
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return ans;
    }

    public int sum(int[] nums,int div){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i]/div + (nums[i]%div == 0?0:1);
        }
        return sum;
    }
}