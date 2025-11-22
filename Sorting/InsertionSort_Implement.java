package Sorting;

public class InsertionSort_Implement {
    public static void main(String[] args) {
        
        int[] arr = {2,  8, 5, 3, 9, 4};

        int i, j, v;

        for (i = 1; i < arr.length; i++) {
            v = arr[i];
            j = i;

            // Move elements of arr[0..i-1], that are greater than v, to one position ahead
            while (j > 0 && arr[j - 1] > v) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = v;
        }

        // Print the sorted array
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
