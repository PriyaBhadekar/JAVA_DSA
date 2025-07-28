/*
1903. Largest Odd Number in String 
Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
*/

package Strings;

public class LargestOddNumber {

    public static String largestOddNumber(String num){

        for(int i = num.length() - 1; i >= 0; i--){

            char current = num.charAt(i);
            if((current - '0') % 2 != 0){
                return num.substring(0 , i + 1); // i + 1 because the sbstring method considers the range from 0 to i it excludes i + 1
            }
        }
        return " ";
    }

    public static void main(String[] args) {
        String num = "52";
        String ans = largestOddNumber(num);
        System.out.println(ans);
    }
    
}
