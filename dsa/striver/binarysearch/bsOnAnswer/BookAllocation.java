package Practice.dsa.striver.binarysearch.bsOnAnswer;

public class BookAllocation {
    public static int findPages(int[] arr, int k) {
        if(k>arr.length){
            return -1;
        }
        // code here
        int i = 1;
        int j = (int)1e9;
        int ans = -1;
        while(i<=j){
            int mid = i + (j-i)/2;
            
            boolean isPossilbe = allocateBooks(arr, k, mid);
            if(isPossilbe){
                ans = mid;
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return ans;
    } 
    
    public static boolean allocateBooks(int[] arr,int s, int pages){
        int currPage = 0;
        int students = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > pages){
                return false;
            }
            currPage += arr[i];
            if(currPage > pages){
                students++;
                currPage = arr[i];
            }
        }
        return students <= s;
    }
}