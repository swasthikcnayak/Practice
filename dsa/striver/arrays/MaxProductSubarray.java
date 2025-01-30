package Practice.dsa.striver.arrays;

public class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        int pos = 1;
        int neg = 1;
        int ans = Integer.MIN_VALUE;
        for (int val : nums) {
            int temp = pos;
            pos = Math.max(val, Math.max(pos * val, neg * val));
            neg = Math.min(val, Math.min(val * temp, neg * val));
            ans = Math.max(ans, Math.max(val, Math.max(pos, neg)));
            if (val == 0) {
                pos = 1;
                neg = 1;
            }

        }
        return ans;
    }
}
