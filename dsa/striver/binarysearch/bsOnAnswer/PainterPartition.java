package Practice.dsa.striver.binarysearch.bsOnAnswer;

import java.util.ArrayList;

public class PainterPartition {
 
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
       int i = 0;
       int j = (int)1e9;

       int ans = -1;
       while(i<=j){
           int mid = i + (j-i)/2;

           boolean possible = partition(boards, k, mid);

           if(possible){
               ans = mid;
               j = mid -1;
           }else{
               i = mid + 1;
           }
       }
       return ans;
    }

    public static boolean partition(ArrayList<Integer> boards ,int k, int mid){
        int part = 1;
        int curr = 0;

        for(int i=0;i<boards.size();i++){
            int value = boards.get(i);
            if(value > mid){
                return false;
            }
            curr += value;

            if(curr > mid){
                part++;
                curr = value;
            }
        }
        return part <= k;
    }
}