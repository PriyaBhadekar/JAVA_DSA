package Sorting;

// Time complexity is O(nlogn)

public class MergeSort_Implement {

    // Recursive function to divide the array and sort the halves
    private static void mergeSort(int[] arr, int l, int r) {
        // Base condition: if left index is less than right, there's something to sort
        if (l < r) {
            // Calculate the middle index safely to avoid overflow
            int mid = l + (r - l) / 2;

            // Recursively sort the first half: arr[l...mid]
            mergeSort(arr, l, mid);

            // Recursively sort the second half: arr[mid+1...r]
            mergeSort(arr, mid + 1, r);

            // Merge the two sorted halves
            merge(arr, l, mid, r);
        }
    }

    // Function to merge two sorted subarrays into a single sorted array
    private static void merge(int[] arr, int l, int mid, int r) {
        // Calculate lengths of the two subarrays
        int n1 = mid - l + 1;  // Elements from l to mid
        int n2 = r - mid;      // Elements from mid+1 to r

        // Create temporary arrays for left and right halves
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        // Copy data into temporary arrays
        for (int x = 0; x < n1; x++) {
            lArr[x] = arr[l + x];
        }

        for (int x = 0; x < n2; x++) {
            rArr[x] = arr[mid + 1 + x];
        }

        // Merge the two arrays back into arr[l...r]
        int i = 0, j = 0, k = l;

        // Compare elements from lArr and rArr, and copy the smaller one into original array
        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from lArr (if any)
        while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }

        // Copy any remaining elements from rArr (if any)
        while (j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 6, 2};

        // Print array before sorting
        System.out.println("Before Sorting:");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        // Call mergeSort on the full array
        mergeSort(arr, 0, arr.length - 1);

        // Print array after sorting
        System.out.println("\nAfter Sorting:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
