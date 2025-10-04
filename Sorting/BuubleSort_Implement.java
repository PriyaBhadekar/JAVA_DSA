package Sorting;

public class BuubleSort_Implement {
    
   // Bubble sort has the time complexity of O(𝑛2) for all cases

    public static void main(String[] args) {
        int arr[] = {10 , 4 , 43, 5, 57, 91, 45, 9, 7};


        // This first solution (without using swap flag)will have the time complexity of O(n2) in all cases
        
         for(int pass = arr.length - 1; pass >= 0; pass--){   // this outer loop states that there are total n - 1 swaps required, hence it is the loop for total passes
            for(int i = 0; i <= pass - 1; i++){               // this loop is to represent total swaps in each pass
                if(arr[i] > arr[i + 1]){
                    //swap elements
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for(int i = 0; i <= arr.length - 1; i++){
            System.out.print(" ");
            System.out.print(arr[i]);
        }
    }
}
