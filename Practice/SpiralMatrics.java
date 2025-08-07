/*
Spiral Matrix Traversal
Problem: Write the code to traverse a matrix in a spiral format.

Input:

5 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20
Output: 1 2 3 4 8 12 16 20 19 18 17 13 9 5 6 7 11 15 14 10
*/


package Practice;
import java.util.*;

public class SpiralMatrics {
    
    public static List<Integer> spiralMatrix(int matrix[][]){

        List<Integer> result = new ArrayList<>();   //To store the resultant array in the form of List
        
        int top = 0;                      // 'top' is pointer set to the row 0
        int btm =  matrix.length - 1;     // 'btm' is a pointer set to the row n -1
        int left = 0;                     // 'left' is pointer set to the column 0\
        int right = matrix[0].length - 1; // 'right' is the pointer set to the last column n - 1


        while(top <= btm && left <= right){     // loop to check the valid travesal

            //To add the element on the first line of matrix i.e. matrix[0][n - 1]
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;      // increamented the top pointer since the horizontal line is added


            //To add the element on the rightmost column thant is matrix[i][right]
            for(int i = top; i <= btm; i++){
                result.add(matrix[i][right]);
            }
            right--;    // Decreamented the right pointer since all the element of the right column are printed

            if(top <= btm){
                for(int i = right; i >= left; i--){
                    result.add(matrix[btm][i]);
                }
                btm--; // Decreamented the bottom pointer since all the element at the bottom row are printed
            }

            if(left <= right){
                for(int i = btm; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;

    }

     public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(spiralMatrix(matrix));
    }
}
