public class MeidanOfSortedArray {
    public static int findMedian(int matrix[][], int m, int n) {
        // Write your code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int[] value: matrix){
            for(int i:value){
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }

        int required = (m*n)/2;

        while(min<=max){
            int mid = min + (max-min)/2;

            int count = 0;

            for(int i=0;i<m;i++){
                count += getLessThan(matrix[i], mid);
            }

            if(count > required){
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }
        return min;
    }

    public static int getLessThan(int[] arr,int target){
        int i= 0;
        int j = arr.length-1;
        int ans = arr.length;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(arr[mid] > target){
                ans = mid;
                j = mid -1;
            }else{
                i = mid + 1;
            }
        }
        return ans;
    }
}