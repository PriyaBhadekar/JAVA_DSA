/* 
1021. Remove Outermost Parentheses

Input: s = "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()". 
*/

package Strings;

public class RemoveOuterParantheses {

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int bal = 0;

        for(char c: s.toCharArray()){

            if(c == '('){
                if(bal > 0){
                    result.append(c);
                }
                bal++;
            }
            else if(c == ')'){
                bal--;

                if(bal > 0){
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String parantheses = "(()()) (())";
        String ans = removeOuterParentheses(parantheses);
        System.out.println(ans);
    }
}
