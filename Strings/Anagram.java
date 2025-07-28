/*
242. Valid Anagram

Input: s = "anagram", t = "nagaram"
Output: true
*/

package Strings;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        char arr1 [] = s.toCharArray();
        char arr2 [] = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1 , arr2);
    }
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
        boolean ans = isAnagram(str1, str2);
        System.out.println(ans);
    }
}
