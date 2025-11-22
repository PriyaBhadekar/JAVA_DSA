package Recursion;

// here we will discuss the basic idea of recursion in Java but not using any actual recursive function, instead we will just illustrate how recursion works using comments and structure.

public class IdeaOfRecursion {
    
    public static void main(String[] args) {
        
        print1(1);
        // This will start the chain of function calls
        // print1 calls print2, print2 calls print3, and so on until print5 is reached.\
        // Each function prints its number before calling the next function.
        // The output will be:
        // 1
        // 2
        // 3
        // 4
        // 5    
        // After print5 is executed, the control returns back to print4, then to print3, print2, and finally back to print1, unwinding the call stack.
    }

    static void print1(int n){
        System.out.println(n);
        print2(n + 1);
    }

    static void print2(int n){
        System.out.println(n);
        print3(n + 1);
    }

    static void print3(int n){
        System.out.println(n);
        print4(n + 1);
    }

    static void print4(int n){
        System.out.println(n);
        print5(n + 1);
    }

    static void print5(int n){
        System.out.println(n);
    }
}
