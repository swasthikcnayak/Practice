package Practice.dsa.striver.binarysearch;

import java.util.ArrayList;

public class MaximumOnesInRow {
    public static int rowMaxOnes(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int i = 0;
        int j = m-1;

        int ans = -1;
        while(i<n && j>=0){
            if(mat.get(i).get(j) == 1){
                j--;
                ans = i;
            }else{
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();
        temp2.add(0);
        temp2.add(0);
        temp2.add(1);
        mat.add(temp2);
        temp.add(1);
        temp.add(1);
        temp.add(1);
        mat.add(temp);
        System.out.println(rowMaxOnes(mat, mat.size(), mat.get(0).size()));
    }
}
