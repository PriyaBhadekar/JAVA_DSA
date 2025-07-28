package Binary_Search;

public class RootNumber {
    
    // Funtion to find the power of mid
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

            //check if N power of mid == M then return the mid
            if(ans == M){
                return mid;
            }
            //if N power of mid < M then search right side or upper bound
            else if(ans < M){
                left = mid + 1;
            }
            //if N power of mid > M then search left side or lower bound
            else{
                right = mid - 1;
            }
        }
        //if M is not found then return -1;
        return -1;
    }

    public static void main(String[] args) {
        int num = 69;
        int result = NthRoot(4, num);
        System.out.println(result);
    }
}
