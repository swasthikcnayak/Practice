package Practice.dsa.striver.sldingwindow;

public class MaxConsecOnes3 {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int i = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] == 0){
                k--;
                if(k<0){
                    while(i<j && nums[i] !=0){
                        i++;
                    }
                    k++;
                    i++;
                }
            }
            ans = Math.max(ans, j-i+1);
        }
        return ans;
    }
}