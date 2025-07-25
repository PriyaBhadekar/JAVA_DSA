//2. Find Product of Two Smallest Numbers in Array Whose Sum is Less Than Given Sum
//Problem: Given a sum and an array, find the product of the two smallest numbers whose sum is less than the given sum.
//Example: Input sum=9, arr=[5,4,2,3,9,1,7], Output: 2


package Arrays;
import java.util.*;
public class Product_of_min_sum {
    
    public static int productofminsum(int [] arr , int sum){
        int prod = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){

                if( i != j && arr[i] + arr[j] < sum){
                    prod = arr[i] * arr[j];
                    min = Math.min(min , prod);
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {5 , 4, 2, 3, 9, 1, 7};
        int result = productofminsum(arr , 9);
        System.out.println(result);
    }
}
