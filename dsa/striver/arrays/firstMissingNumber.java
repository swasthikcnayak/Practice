package Practice.dsa.striver.arrays;

public class firstMissingNumber {
    public int missingNumber(int[] nums) {
        for(int i=1;i<nums.length;i++){
            int correctPosition = nums[i];
            if(correctPosition != i && correctPosition < nums.length){
                swap(nums, correctPosition, i);
                i--;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;


    }

    private void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
