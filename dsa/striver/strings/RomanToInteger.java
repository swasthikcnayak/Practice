package Practice.dsa.striver.strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {

        Map<Character,Integer> order  = new HashMap<>();
        order.put('I',1);
        order.put('V', 5);
        order.put('X', 10);
        order.put('L', 50);
        order.put('C', 100);
        order.put('D', 500);
        order.put('M', 1000);
        
        int i = 0;
        int ans = 0;
        while(i<s.length()-1){
           if(order.get(s.charAt(i)) < order.get(s.charAt(i+1))){
            ans -= order.get(s.charAt(i));
           }else{
            ans += order.get(s.charAt(i));
           }
           i+=1;
        }
        return ans + order.get(s.charAt(s.length()-1));


    }
}