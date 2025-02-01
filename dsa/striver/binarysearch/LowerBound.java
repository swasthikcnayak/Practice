package Practice.dsa.striver.binarysearch;

public class LowerBound {
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int ans = n;
        int i = 0;
        int j = n-1;

        while(i<=j){
            int mid = i + (j-i)/2;

            if(arr[mid] >= x){
                ans = mid;
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return ans;
    }
}