package Stacks;
import java.util.*;


class Stack_using_Array {
    
    int stack[];
    int top;
    int size;

    public Stack_using_Array(int stackSize){
        stack = new int[stackSize];
        size = stackSize;
        top = -1;
    }

    public void push(int element){

        if(top >= size - 1){
            System.out.println("Stack is full - OverFlow");
            return;
        }
        top++;
        stack[top] = element;
    }

    public boolean isEmpty(){
        return top <= -1;
    }

    public int size(){
        return top + 1;
    }


    public int peek(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        return stack[top];       
    }

    public int pop(){
        int val = peek();
        if(val != Integer.MIN_VALUE){
            top--;
        }
        return val;
    }

    public void printstack(){
        for(int i = 0; i <= top; i++){
            System.out.print(stack[i]);
            if( i != top){
                System.out.print(",");
            }
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Stack_using_Array stack = new Stack_using_Array(n);
        System.out.println(stack.isEmpty());
        stack.push(4);
        stack.push(6);
        stack.push(1);
        stack.printstack();
        stack.pop();
        System.out.println(stack.isEmpty());
        stack.printstack();

    }
}
