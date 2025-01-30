package Practice.dsa.striver.arrays;

public class RepeatingMissingNumber {
    
    public int[] repeatingMissingNubmer(int[] arr){
        int n = arr.length;
        int sum = n*(n+1)/2;
        int[] ans = new int[2];


        for(int i=0;i<n;i++){
            int abs = Math.abs(arr[i]);
            if(arr[abs-1] > 0){
                arr[abs-1] = -arr[abs-1];
                sum-=abs;
            }else{
                ans[0] = abs; // repeating
            }
        }
        ans[1] = sum; // missing
        return ans;
    }

    public int[] repeatingMissingSum(int[] arr){
        int n = arr.length;
        int sum = n*(n+1)/2;
        int ssum = n*(n+1)*(2*n+1)/6;

        for(int value : arr){
            sum -= value;
            ssum -= (value*value);
        }

        int[] ans = new int[2];
        ans[1] = (ssum/sum + sum)/2;
        ans[0] = ans[1] - sum;
        return ans;
    }

    public int[] someOptimization(int[][] grid){
            int m = grid[0].length;
            int n = grid.length;
            int[] arr = new int[m*n];
    
            int i = 0;
            for(int[] row: grid){
                for(int val: row){
                    arr[i++] = val;
                }
            }
            n = arr.length;
            i = 1;
            long sum = 0;
            long ssum = 0;
    
            for(int value : arr){
                sum += i;
                ssum += i*i;
                sum -= value;
                ssum -= (value*value);
                i++;
            }
    
            int[] ans = new int[2];
            ans[1] = (int)(ssum/sum + sum)/2;
            ans[0] = (int)(ans[1] - sum);
            return ans;
    }
}
