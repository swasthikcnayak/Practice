package Practice.dsa.striver.strings;

import java.util.HashMap;
import java.util.Map;

public class IsoMorphicString {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();

        if(s.length() != t.length())return false;

        int i = 0;
        int j = 0;

        while(i<s.length() && j<t.length()){
            char c1 = s.charAt(i);
            char c2 = t.charAt(j);

            if(map1.containsKey(c1)){
                char mapc1 = map1.get(c1);
                if(mapc1 != c2){
                    return false;
                }
            }else{
                char mapc2 = map2.getOrDefault(c2, '.');
                if(mapc2=='.'){
                    map1.put(c1, c2);
                    map2.put(c2, c1);
                }else{
                    if(mapc2 != c1){
                        return false;
                    }
                }
            }
            i++;j++;
        }
        return true;
    }
}