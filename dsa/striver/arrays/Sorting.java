package Practice.dsa.striver.arrays;

public class Sorting {

    public void slectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minidx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minidx] > arr[j]) {
                    minidx = j;
                }
            }
            swap(arr, i, minidx);
        }
    }

    public void bubblesort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public void insertionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j - 1 >= 0 && arr[j] < arr[j - 1]) {
                swap(arr, j - 1, j);
                j--;
            }
        }
    }

    public void mergeSort(int[] arr, int i, int j) {
        if (i <= j) {
            int mid = (i + j) / 2;
            mergeSort(arr, i, mid);
            mergeSort(arr, mid + 1, j);
            merge(arr, i, mid, j);
        }
    }

    private void merge(int[] arr, int i, int mid, int j) {
        int s1 = mid - i + 1;
        int s2 = j - mid;

        int[] larr = new int[s1];
        int[] rarr = new int[s2];

        int idx = 0;
        for (int t = i; t <= mid; t++) {
            larr[idx++] = arr[t];
        }
        idx = 0;
        for (int t = mid + 1; t <= j; t++) {
            rarr[idx++] = arr[t];
        }

        int iter1 = 0;
        int iter2 = 0;
        int t = i;

        while (iter1 < s1 && iter2 < s2) {
            if (larr[iter1] < rarr[iter2]) {
                arr[t++] = larr[iter1++];
            } else {
                arr[t++] = rarr[iter2++];
            }
        }

        while (iter1 < s1) {
            arr[t++] = larr[iter1++];
        }
        while (iter2 < s2) {
            arr[t++] = rarr[iter2++];
        }
    }

    public void quickSort(int[] arr, int i, int j) {
        if (i < j) {
            int pivot = getPivotIdx(arr, i, j);
            quickSort(arr, i, pivot - 1);
            quickSort(arr, pivot + 1, j);
        }
    }

    public int getPivotIdx(int[] arr, int i, int j) {
        int low = i;
        int pivot = arr[i];
        while (i < j) {
            while (i < j && arr[j] > pivot) {
                j--;
            }
            while (i < j && arr[i] <= pivot) {
                i++;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
