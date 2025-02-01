package Practice.dsa.striver.binarysearch;

public class AllTwiceExceptOne {

    // does not check the end points before hand.
    public int singleNonDuplicate1(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (mid % 2 == 0) {
                if (mid-1>=0 && nums[mid - 1] == nums[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else {
                if (mid+1 <nums.length && nums[mid + 1] == nums[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }
        }
        return nums[j];
    }

    // checking end points before hand so that do not have to check the out of bound cases

    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1 || nums[0] != nums[1]) {
            return nums[0];
        }
        int n = nums.length - 1;
        if (nums[n] != nums[n - 1]) {
            return nums[n];
        }
        int i = 1;
        int j = n - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (mid % 2 == 0) {
                if (nums[mid - 1] == nums[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else {
                if (nums[mid + 1] == nums[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }
        }
        return nums[j];
    }
}
