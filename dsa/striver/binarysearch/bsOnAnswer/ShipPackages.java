package Practice.dsa.striver.binarysearch.bsOnAnswer;

public class ShipPackages {
    public int shipWithinDays(int[] weights, int days) {
        int i = 0;
        int j = (int)1e9;
        int ans = j;
        while(i<=j){
            int mid = i + (j-i)/2;

            boolean isPossible = isPossibleToLoad(weights, days, mid);
            if(isPossible){
                ans = mid;
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return ans;
    }

    public boolean isPossibleToLoad(int[] weights,  int days,int maxweight){
        int currentWeight = 0;
        for(int i=0;i<weights.length;i++){
            if(weights[i] > maxweight){
                return false;
            }
            currentWeight += weights[i];
            if(currentWeight > maxweight){
                days--;
                currentWeight = weights[i];
            }
        }
        return days>0;
    }
}