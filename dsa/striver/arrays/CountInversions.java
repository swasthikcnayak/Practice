package Practice.dsa.striver.arrays;

import java.util.Arrays;

public class CountInversions {
    
      public static int numberOfInversions(int []a, int n) {
        return mergeSort(a, 0, n-1);
    }

    public static int mergeSort(int[] arr,int l,int r){
        if(l<r){
            int mid = l + (r-l)/2;
            return mergeSort(arr, l, mid) + mergeSort(arr, mid+1, r) + merge(arr, l, mid, r);
        }
        return 0;
    }

    public static int merge(int[] arr,int l, int mid,int r){

        int[] larr = Arrays.copyOfRange(arr, l, mid + 1);
        int[] rarr = Arrays.copyOfRange(arr, mid+1, r+1);

        int invCount = 0;

        int i = 0;
        int j = 0;
        int k = l;
        while(i<larr.length && j<rarr.length){
            if(larr[i] <= rarr[j]){
                arr[k++] = larr[i];
                i++;
            }else{
                arr[k++] = rarr[j++];
                invCount=invCount + (larr.length - i);
            }
        }

        while(i<larr.length){
            arr[k++] = larr[i++];
        }

        while(j<rarr.length){
            arr[k++] = rarr[j++];
        }
        return invCount;
    } 
}
