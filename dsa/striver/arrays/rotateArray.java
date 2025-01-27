package Practice.dsa.striver.arrays;

public class rotateArray {
    
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k==0){
            return ;
        }
        rotate(nums, 0,  nums.length-k-1);
        rotate(nums, nums.length-k, nums.length-1);
        rotate(nums, 0, nums.length-1);
    }

    private void rotate(int[] arr,int i,int j){
        while(i<=j){
        int temp=arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        i++;j--;
        }
    }
}
