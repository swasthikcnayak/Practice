package Practice.dsa.striver.sldingwindow;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubstringsContainingAllKCharacters {
    public int numberOfSubstrings(String s) {
        return getNumberWithKCharacters(s, 3) - getNumberWithKCharacters(s, 2);
    }

    public int getNumberWithKCharacters(String s, int k){
        int count = 0;
        int i = 0;
        int j = 0;
        Map<Character,Integer> map = new HashMap<>();

        for(;j<s.length();j++){
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0)+1);
            
            while(map.size()>k){
                char temp = s.charAt(i);
                int count2 =map.get(temp);
                if(count2 ==1){
                    map.remove(temp);
                }else{
                    map.put(temp, count2 - 1);
                }
                i++;
            }
            count += (j -i + 1);
        }
        return count;
    }
}