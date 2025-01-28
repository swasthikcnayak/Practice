package Practice.dsa.striver.arrays;

/**
 * Logic is that to get the next larger number :
 *  the smaller number from right has to be replaced with the next larger number.
 * 
 * Find the first dip starting from right.
 * then swap the dip element with the largest element starting from the right.
 * Then reverse the array to the right of dip element to maintain the increasing order.
 * Key observation : ALWAYS THE NUMBER IS MADE OF INCREASING NUMBER AT END.
 * 
 * 
 * 3 5 2 1
 * Increasing order is only 1.
 * Dip is identified at 3.
 * number greater than 3 is found : 5
 * becomes : 5 3 2 1
 * swap the element to right of 5: 
 * 5 1 2 3 : This is the next permutation
 */
public class NextPermuation {
    void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void nextPermutation(int[] nums) {
        int idx = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }

        if(idx!=-1){
            for(int i=nums.length-1;i>idx;i--){
                if(nums[i] > nums[idx]){
                    swap(nums, i, idx);
                }
            }
        }
        reverse(nums, idx+1);
    }

    private void reverse(int[] arr,int start){
        int end = arr.length  - 1;

        while(start <= end){
            swap(arr, start, end);
            start++;end--;
        }
    }
}
