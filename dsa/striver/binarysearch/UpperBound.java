package Practice.dsa.striver.binarysearch;

public class UpperBound {
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int i = 0;
        int ans = n;
        int j = n-1;

        while(i<=j){
            int mid = i + (j-i)/2;

            if(x == arr[mid]){
                i = mid + 1;
            }else if(arr[mid] > x){
                ans = mid;
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return ans;
    }
}

