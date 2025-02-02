package Practice.dsa.striver.binarysearch.bsOnAnswer;

import java.util.Arrays;

public class AggressiveCows {
    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        int i = 1;
        int j = (int)1e9;
        int ans = 0;
        while(i<=j){
            int mid = i + (j-i)/2;

            boolean isPossilbeToPlace = placeCows(stalls,k,mid);
            if(isPossilbeToPlace){
                ans = mid;
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return ans;
    }

    public static boolean placeCows(int[] stalls, int cows,int diff){
        cows--;
        int prevPosition = stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i] - prevPosition >= diff){
                cows--;
                prevPosition = stalls[i];
            }
            if(cows == 0){
                return true;
            }
        }
        return cows<=0;
    }
}