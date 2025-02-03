package Practice.dsa.striver.sldingwindow;

public class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        int[] count = new int[256];

        int ans=  0;
        int i = 0;
        for(int j=0;j<s.length();j++){
            count[s.charAt(j)]++;
            if(count[s.charAt(j)] > 1){
                while(i<j && s.charAt(i) != s.charAt(j)){
                    count[s.charAt(i)]--;
                    i++;
                }
                count[s.charAt(i)]--;
                i++;
            }
            ans = Math.max(ans, j-i+1);
        }
        return ans;
    }
}