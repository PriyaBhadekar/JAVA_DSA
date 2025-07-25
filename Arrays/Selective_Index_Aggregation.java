//1. Sum of Second Smallest Element at Odd Positions and Largest at Even Positions
//Problem: Given an array, calculate the sum of the second-smallest element from odd positions and the largest element from even positions.
//Example: Input [3, 2, 1, 7, 5, 4], Output: 7


package Arrays;
import java.util.*;
public class Selective_Index_Aggregation {
    

    public static int positionindexedvalue(int[] arr){
        List<Integer> evenlist = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){

            if(i % 2 == 0){
                evenlist.add(arr[i]);
            }else{
                oddList.add(arr[i]);
            }
        }

        if(oddList.size() < 2){
            return -1;
        }

        Collections.sort(oddList);

        int secsmallval = oddList.get(1);

        int largest = Collections.max(evenlist);

        return secsmallval + largest;

    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 7, 4, 5};
        int result = positionindexedvalue(arr);
        System.out.println("Result: " + result);  // Output: 10
    }
}
