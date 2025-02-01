package Practice.dsa.striver.binarysearch;

public class SearchInArray {
    public int serach(int[] nums,int element){
        int l = 0;
        int r= nums.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(element == nums[mid]){
                return mid;
            }else if(element > nums[mid]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return -1;
    }
}
