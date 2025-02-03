package Practice.dsa.striver.sldingwindow;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBasket {
    public int totalFruit(int[] fruits) {
        int k = 2;
        int i = 0;
        int j = 0;
        int ans = 0;

        Map<Integer,Integer> countMap = new HashMap<>();
        for(;j<fruits.length;j++){
            int curr = fruits[j];
            countMap.put(curr, countMap.getOrDefault(curr,0)+1);
            while(countMap.size() > k){
                int prev = fruits[i];
                int value = countMap.get(prev);
                if(value == 1){
                    countMap.remove(prev);
                }else{
                    countMap.put(prev, value -1);
                }
                i++;
            }
            ans = Math.max(ans, j - i+1);
        }
        return ans;
    }
}
