package Recursion;

public class PracticeFourDigitSum {
    public static void main(String[] args) {
        
        int result = DigitSum(1234);
        int mulResult = DigitMul(1234);
        System.out.println(mulResult);
        System.out.println(result);
    }

    static int DigitSum(int n){

        if(n == 0){
            return 0;
        }

        return (n % 10) + DigitSum(n / 10);
    }

    static int DigitMul(int n){

        if(n%10 == n){
            return n;
        }

        return (n % 10) + DigitMul(n / 10);
    }
}
