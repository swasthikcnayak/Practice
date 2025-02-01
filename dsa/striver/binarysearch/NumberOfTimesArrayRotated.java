package Practice.dsa.striver.binarysearch;

public class NumberOfTimesArrayRotated {
    
    public static int solve(int[] nums){
        int i = 0;
        int j = nums.length - 1;

        int minIdx = -1;
        int minValue = Integer.MAX_VALUE;
        while(i<=j){
            int mid = i + (j-i)/2;


            if(nums[mid] >= nums[i]){
                if(nums[i] < minValue){
                    minIdx = i;
                    minValue = nums[i];
                }
                i = mid + 1;
            }else{
                if(nums[mid] < minValue){
                    minIdx = mid;
                    minValue = nums[mid];
                }
                j = mid - 1;
            }
        }
        return minIdx;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,4,5,1,2};
        System.out.println(solve(arr));
    }
}
