package Practice.dsa.striver.arrays;

import java.util.ArrayList;
import java.util.List;

public class UnionSortedArrays {
    
    public List<Integer> union(int[] arr1,int[] arr2){
        List<Integer> ans = new ArrayList<>();

        int i =0;
        int j =0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                ans.add(arr1[i]);
                i++;
            }else if(arr2[j] < arr1[i]){
                ans.add(arr2[j]);
                j++;
            }else{
                ans.add(arr1[i]);
                i++;j++;
            }

            while(i>0 && i<arr1.length && arr1[i] == arr1[i-1]){
                i++;
            }
            while(j>0 && j<arr2.length && arr2[j] == arr2[j-1]){
                j++;
            }
        }

        if(i<arr1.length){
            if(i==0){
                ans.add(arr1[i]);
            }
            else if(arr1[i] != arr1[i-1]){
                ans.add(arr1[i]);
            }
            i++;
        }

        if(j<arr2.length){
            if(j==0){
                ans.add(arr2[j]);
            }
            else if(arr2[j] != arr2[j-1]){
                ans.add(arr2[j]);
            }
            j++;
        }

        return ans;
    }
}
