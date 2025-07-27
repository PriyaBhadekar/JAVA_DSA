package Binary_Search;

public class SquareRoot {
    
    public static long root(long n){
        long left = 0;
        long right = n;
        long mid = 0 , ans = 0;

        while(left <= right){

            //Calculate Mid to eliminate to search complete range
            mid = left + (right - left) / 2;

            if((long) mid * mid == n){
                return mid;
            }else if((long) mid * mid < n){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        long num = 36;
        long result = root(num);

        System.out.println(result);
    }
}
