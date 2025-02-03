package Practice.dsa.striver.strings;

public class LargestOddNumberString {
    public String largestOddNumber(String num) {

        char[] arr = num.toCharArray();
        int i = arr.length-1;
        for(;i>=0;i--){
            if((arr[i]-'0')%2==1){
                break;
            }
        }
        if(i>=0){
            return num.substring(0,i+1);
        }
        return "";
    }
}