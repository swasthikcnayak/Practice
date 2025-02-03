package Practice.dsa.striver.strings;

public class MaximumNesting {
    public int maxDepth(String s) {
        int ans = 0;
        int opencount = 0;
        for(char c: s.toCharArray()){
            if(c=='('){
                opencount++;
            }else if(c==')'){
                opencount--;
            }
            ans = Math.max(ans, opencount);
        }
        return ans;
    }

}