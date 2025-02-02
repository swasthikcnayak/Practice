package Practice.dsa.striver.binarysearch.bsOnAnswer;

public class NthRoot {
    public int nthRoot(int n, int m) {
        // code here
        
        int i = 1;
        int j = m;
        
        while(i<=j){
            int mid = i + (j-i)/2;
            
            long powerVal = (int)Math.pow(mid, n);
            if(powerVal == m){
                return mid;
            }else if(powerVal > m){
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return -1;
    }
}
