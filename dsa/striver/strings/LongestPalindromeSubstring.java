package Practice.dsa.striver.strings;

public class LongestPalindromeSubstring {
    public String longestPalindrome(String s) {
        String ans = "";
        int maxLen = 0;
        for(int i=0;i<s.length();i++){
            String s1 = spreadOut(s, i,i);
            String s2 = spreadOut(s, i, i+1);

            if(s1.length()>maxLen){
                maxLen = s1.length();
                ans = s1;
            }
            if(s2.length()>maxLen){
                maxLen = s2.length();
                ans = s2;
            }
        }
        return ans;
    }

    public String spreadOut(String s, int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;r++;
        }
        return s.substring(l+1, r);
    }
}