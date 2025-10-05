package Sorting;

public class QuickSort_Implemet {

    public static void quicksort(int[] arr, int low, int high) {

        if (low < high) {
            int pi = partition(arr, low, high);

            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 4, 43, 5, 57, 91, 45, 9, 7 };

        quicksort(arr, 0, arr.length - 1);

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(" ");
            System.out.print(arr[i]);
        }
    }

}
