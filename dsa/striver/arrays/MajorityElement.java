package Practice.dsa.striver.arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 1;

        for(int i=1;i<nums.length;i++){
            int value = nums[i];
            if(value == majority){
                count++;
            }else{
                count--;
                if(count == 0){
                    majority = value;
                    count = 1;
                }
            }
           
        }
         return majority;
    }
}