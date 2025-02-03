package Practice.dsa.striver.strings;

public class RemoveOuterMostParenthesis {
    public String removeOuterParentheses(String s) {
        int openCount = 0;
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c=='('){
                if(openCount != 0)
                    sb.append(c);
                openCount++;
            }else{
                if(openCount!=1)
                    sb.append(c);
                openCount--;
            }
        }
        return sb.toString();
    }
}
