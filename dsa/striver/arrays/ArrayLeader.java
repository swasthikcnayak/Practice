package Practice.dsa.striver.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeader {
    
    public static ArrayList<Integer> findLeaders(ArrayList<Integer> arr) {
        int maxTillNow = Integer.MIN_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=arr.size()-1;i>=0;i--){
            if(arr.get(i) >= maxTillNow){
                maxTillNow = arr.get(i);
                ans.add(arr.get(i));
            }
        }
		Collections.reverse(ans);
		return ans;
    }


    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(5);
        arr.add(2);
        ArrayList<Integer> ans = findLeaders(arr);
        for(int i: ans){
            System.out.println(i);
        }

    }
}
