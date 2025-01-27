package Practice.dsa.striver.arrays;

public class checkRotatedSortedArray {
    
    /*
     * We check with the previous element, only once allowed to go dip, 
     * we need to check for frist element with last element : this is an edge case
     */
    public boolean check(int[] nums) {
        int i = 1;
        int dip = 0;
        while(i<nums.length){
            if(nums[i] >= nums[i-1]){
                i++;
            }else{
                i++;
                dip++;
            }
        }
        if(nums[0] < nums[nums.length-1]){ // becasue circular
            dip++;
        }
        if(dip > 1){
            return false;
        }
        return true;
    }
}
