package Sorting;

// Selection sort: an improved version of bubble sort
// It limits to only one swap per pass
// Repeatedly selects the largest element and puts it in its correct position

public class SelectionSort_Implement {
    public static void main(String[] args) {
        int arr[] = {10, 4, 43, 5, 57, 91, 45, 9, 7};

        // Outer loop for passes
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;

            // Inner loop to find the index of the maximum element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }

            // Swap arr[i] with arr[max]
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
