/*
796. Rotate String

Input: s = "abcde", goal = "cdeab"
Output: true
*/


package Strings;

public class RotatedString {

    public static boolean rotateString(String s, String goal){

        if(s.length() != goal.length()){
            return false;
        }

        String concatinated = s + s;
        return concatinated.contains(goal);
    }

    public static void main(String[] args) {
        String example = "abcde";
        boolean ans = rotateString(example , "cdbec");
        System.out.println(ans);
    }
    
}
