package Recursion;

public class Recursive_BinarySearch {
    public static void main(String[] args) {

        int[] arr = {9, 7, 5, 3, 1};
        int target = 9;
        int result = binarySearch(arr, 0, arr.length - 1, target);
        System.out.println(result);
        
    }

    static int binarySearch(int[]arr, int start, int end, int target){

        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] < target){
            return binarySearch(arr, start, mid - 1, target);
        }

        return binarySearch(arr, mid + 1, end, target);
    }
}
