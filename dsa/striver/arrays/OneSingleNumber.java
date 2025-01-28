package Practice.dsa.striver.arrays;

public class OneSingleNumber {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i: nums){
            xor ^=i;
        }
        return xor;
    }
}
