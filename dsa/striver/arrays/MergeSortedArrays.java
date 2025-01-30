package Practice.dsa.striver.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArrays {
    
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1,i2)->{
             return i1[0] - i2[0];
         });
         int n = intervals.length;
         List<int[]> ans = new ArrayList<>();
         ans.add(intervals[0]);
         int size = 0;
         for(int i=1;i<intervals.length;i++){
             if(intervals[i][0] <= ans.get(size)[1]){
                 ans.get(size)[1] = Math.max(intervals[i][1], ans.get(size)[1]);
             }else{
                 ans.add(intervals[i]);
                 size++;
             }
         }
 
         int[][] result = new int[ans.size()][2];
         int i = 0;
         for(int[] t: ans){
             result[i] = t;
             i++;
         }
         return result;
     }

}
