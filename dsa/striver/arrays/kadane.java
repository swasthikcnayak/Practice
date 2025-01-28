package Practice.dsa.striver.arrays;

public class kadane {
    public int maxSubArray(int[] nums) {
        int start = 0;
        int sum = 0;
        int maxsum = 0;
        int s = 0;
        int len = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum > maxsum){
                maxsum = sum;
                start = s;
                len = i - s + 1;
            }
            if(sum < 0){
                sum = 0;
                s = i+1;
            }
        }
        System.out.println(start+" "+len);
        return maxsum;
    }
}
