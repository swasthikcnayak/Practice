package Practice.dsa.striver.binarysearch.bsOnAnswer;

public class KthMissingNumber {
    public int findKthPositive(int[] arr, int k) {
        int i = 0;
        int j = arr.length - 1;
        if(k<arr[0]){
            return k;
        }
        while(i<=j){
            int mid = i + (j-i)/2;

            int missingToLeft = arr[mid] - mid - 1;

            if(k>missingToLeft){
                 i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return arr[j] + (k - arr[j]  + j  +1); 
    }
}