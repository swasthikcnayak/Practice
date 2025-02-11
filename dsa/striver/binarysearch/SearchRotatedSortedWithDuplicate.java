package Practice.dsa.striver.binarysearch;

public class SearchRotatedSortedWithDuplicate {
    public boolean search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        if(nums[i] == target){
            return true;
        }
        if(nums[i] == nums[j]){
            int value = nums[i];
            while(i<nums.length && nums[i] == value){i++;}
            while(j>i && nums[j] == value){j--;}
        }

        while(i<=j){
            int mid = i + (j-i)/2;

            if(target == nums[mid]){return true;}
            if(nums[mid] == nums[i] && nums[mid] == nums[j]){i++;j--;}
            else if(nums[mid] >= nums[i]){
                if(target >= nums[i] && target <= nums[mid]){
                    j = mid - 1;
                }else{
                    i = mid + 1;
                }
            }
            else{
                if(target >= nums[mid] && target <= nums[j]){
                    i = mid + 1;
                }else{
                    j = mid - 1;
                }
            }
        
        }

        return false;
    }
}