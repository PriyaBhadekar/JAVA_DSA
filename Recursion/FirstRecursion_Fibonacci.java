package Recursion;

public class FirstRecursion_Fibonacci {
    public static void main(String[] args) {
        
        int n = 4;
        int result = fibonacci(n);
        System.out.println(result);
    }

    static int fibonacci(int n){

        if(n  < 2){
            return n;
        }
 
        return fibonacci(n - 1) + fibonacci(n - 2);
        // this line is doing two things:
        // 1. it is making two recursive calls to the fibonacci function with arguments (n - 1) and (n - 2).
        // 2. it is adding the results of these two calls together and returning the sum
        // this is based on the Fibonacci sequence definition where each number is the sum of the two preceding ones.
        // for example, to calculate fibonacci(4):
        // fibonacci(4) calls fibonacci(3) and fibonacci(2)
        // fibonacci(3) calls fibonacci(2) and fibonacci(1)
        // fibonacci(2) calls fibonacci(1) and fibonacci(0)
        // the base cases return 1 and 0 respectively
        // then we can backtrack and sum up the results to get fibonacci(4) = 3
        // this process continues recursively until all calls are resolved back to the original call.
        // this illustrates the concept of recursion where a function calls itself to solve smaller instances of the same problem.
        // however, note that this naive recursive approach has exponential time complexity due to repeated calculations.
        // for larger n, more efficient methods like memoization or iterative approaches are preferred.
        // but for understanding recursion, this example serves well.
    }
    
}
