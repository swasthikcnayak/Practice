package Practice.dsa.striver.arrays;

public class maxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=0, count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
            }else{
                maxCount=Math.max(count,maxCount);
                count=0;
            }
        }
        return Math.max(count, maxCount);
    }


    public int findMaxConsecutiveOnes2(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;){
            int j = i;
            while(j<nums.length && nums[j] == 1){ 
                 j++;
            } 
            ans = Math.max(ans, j-i);
            i = j;
            while(i<nums.length && nums[i] != 1){
                i++;
            }
        }
        return ans;
    }
}
