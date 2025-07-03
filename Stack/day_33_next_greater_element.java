package Stack;

import java.util.Scanner;

public class day_33_next_greater_element {
    public static class stack_greater_element{
        private int[] arr;
        private int capacity;
        private int top;

        public stack_greater_element(int size){
            capacity = size;
            arr = new int[capacity];
            top = -1;
        }

        public void push(int n){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            top = top+1;
            arr[top] = n;
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int remove = arr[top];
            top=top-1;
            return remove;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top];
        }

        public boolean isFull(){
            return top == arr.length-1?true:false;
        }
        public boolean isEmpty(){
            return top == -1?true:false;
        }
    }
    public static void printNGE(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        stack_greater_element stack = new stack_greater_element(n);

         // Traverse from right to left
         for(int i = n-1;i>=0;i--){
            // Pop all elements smaller than or equal to arr[i]
            while (!stack.isEmpty() && stack.peek()<=arr[i]) {
                stack.pop();
            }
            // If stack is empty, no greater element
            result[i] = stack.isEmpty()? -1:stack.peek();

             // Push current element to stack
             stack.push(arr[i]);

         }
         // Print the result
        for (int nge : result) {
            System.out.print(nge + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element " +i + ": ");
            int a = sc.nextInt();
            arr[i] = a;
        }
        System.out.println("ELements is array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //int[] arr1 = {4, 5, 2, 25};
        System.out.print("Next greatest element: ");
        printNGE(arr);
        sc.close();
    }
}
