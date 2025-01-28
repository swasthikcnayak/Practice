package Practice.dsa.striver.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int max = 0;
        // can iterate over array as well, but set iteration is efficient
        for(int i: set){
            if(!set.contains(i-1)){
                max = Math.max(max, getLength(set, i));
            }
        }
        return max;
    }

    int getLength(Set<Integer> set, int start){
        int len = 1;
        start++;
        while(set.contains(start)){
            start++;
            len++;
        }    
        return len;
        }
}
