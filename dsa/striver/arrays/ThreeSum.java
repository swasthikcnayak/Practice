package Practice.dsa.striver.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<arr.length;){
            
            int j = i + 1;
            int k =arr.length -1;

            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    ans.add(new ArrayList(temp));
                    j++;k--;
                    while(j<k && arr[j-1] == arr[j]){
                        j++;
                    }
                    while(k>j && arr[k+1] == arr[k]){
                        k--;
                    }
                }else if(sum > 0){
                    k--;
                    while(k>j && arr[k+1] == arr[k]){
                        k--;
                    }
                }else if(sum < 0){
                    j++;
                    while(j<k && arr[j-1] == arr[j]){
                        j++;
                    }
                }
            }
            i++;
            while(i<arr.length && arr[i]==arr[i-1]){
                i++;
            }
        }
        return ans;
    }
}