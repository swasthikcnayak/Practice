package Practice.dsa.striver.sldingwindow;

public class NiceSubArrays {
    public int numberOfSubarrays(int[] nums, int k) {
        return getNumber(nums, k) - getNumber(nums, k-1);
    }
    int getNumber(int[] nums,int k){
        int count = 0;
        int i = 0;
        int j = 0;
        for(j=0;j<nums.length;j++){
            if(nums[j]%2 == 1){
                k--;
            }
            while(k<0){
                int value = nums[i];
                if(value%2==1){
                    k++;
                }
                i++;
            }
            count += (j-i+1);
        }
        return count;
    }
}