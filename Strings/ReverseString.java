/*
151. Reverse Words in a String
 
Input: s = "the sky is blue"
Output: "blue is sky the"
 */

package Strings;

public class ReverseString {
    public static String reverseWords(String s) {
        s = s.trim();
        String words [] = s.split("//s+");
        StringBuilder reversed = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            reversed.append(words[i]);
            
            if(i >= 0){
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "The sky is blue";
        String ans = reverseWords(str);
        System.out.println(ans);
    }
    
}
