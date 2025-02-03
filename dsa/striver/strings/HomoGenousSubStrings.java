package Practice.dsa.striver.strings;

public class HomoGenousSubStrings {
    public int countHomogenous(String s) {
        int MOD = (int)1e9 + 7;
        long count = 0;
        int i =0;
        int j = 0;
        while(j<s.length()){
            j = i;
            while(j<s.length() && s.charAt(j) == s.charAt(i)){
                j++;
            }
            long n = (j-i);
            count = count + (n*(n+1)/2)%MOD;
            i = j;
        }
        return (int)count;
    }
}