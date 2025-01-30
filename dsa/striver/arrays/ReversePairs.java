package Practice.dsa.striver.arrays;

import java.util.Arrays;

public class ReversePairs {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public int mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            return mergeSort(arr, l, mid) + mergeSort(arr, mid + 1, r) + merge(arr, l, mid, r);
        }
        return 0;
    }

    public int merge(int[] arr, int l, int mid, int r) {
        int[] larr = Arrays.copyOfRange(arr, l, mid + 1);
        int[] rarr = Arrays.copyOfRange(arr, mid + 1, r + 1);

        int k = l;
        int i = 0;
        int j = 0;
        int count = 0;

        while (i < larr.length && j<rarr.length) {
            if (larr[i] > (long)2 * rarr[j]) {
                count = count + (larr.length - i);
                j++;
            } else {
                i++;
            }
        }
        i = 0;
        j = 0;
        while (i <larr.length && j<rarr.length) {
            if (larr[i] <= rarr[j]) {
                arr[k++] = larr[i++];
            } else {
                arr[k++] = rarr[j++];
            }
        }

        while (i < larr.length) {
            arr[k++] = larr[i++];
        }
        while (j < rarr.length) {
            arr[k++] = rarr[j++];
        }
        return count;
    }
}