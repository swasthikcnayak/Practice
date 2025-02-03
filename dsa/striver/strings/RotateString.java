package Practice.dsa.striver.strings;

public class RotateString {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String newString = s+s;
        return (newString.indexOf(goal)!=-1);
    }
}
