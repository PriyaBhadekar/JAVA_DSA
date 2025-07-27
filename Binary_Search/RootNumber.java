package Binary_Search;

public class RootNumber {
    
    public static int power(int base , int exponent){
        int result = 1;

        for(int i = 1; i <= exponent; i++){
            result *= base;

            if(result > Integer.MAX_VALUE){
                break;
            }
        }
        return result;
    }


    public static int NthRoot(int N , int M){
        int left = 0;
        int right = M;
        int mid = 0;
        int ans = 0;

        while(left <= right){

            mid = left + (right - left) / 2;
            ans = power(mid, N);

            if(ans == M){
                return mid;
            }else if(ans < M){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num = 69;
        int result = NthRoot(4, num);
        System.out.println(result);
    }
}
