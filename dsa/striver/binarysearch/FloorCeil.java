package Practice.dsa.striver.binarysearch;

public class FloorCeil {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {

        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int l = 0;
        int r = n-1;
  
        while(l<=r){
          int mid = l + (r-l)/2;
          if(a[mid] >= x){
            ans[1] = a[mid];
            r = mid - 1;
          }else{
            l = mid + 1;
          }
        }
        
        l = 0 ;
        r = n - 1;
  
        while(l<=r){
          int mid = l + (r-l)/2;
          if(a[mid] <= x){
            ans[0] = a[mid];
            l = mid + 1;
          }else{
            r = mid -1;
          }
        }
        return ans;
      }
      
  }