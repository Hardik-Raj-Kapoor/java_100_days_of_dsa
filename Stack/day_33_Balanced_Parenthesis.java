package Stack;

import java.util.Scanner;

public class day_33_Balanced_Parenthesis {
    public static class balanced_stack{
        private char arr[];
        private int capacity;
        private int top;

        balanced_stack(int size){
            capacity = size;
            arr = new char[capacity];
            top = -1;
        }

        public void push(char n){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            top = top+1;
            arr[top] = n;
        }

        public char pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return '\0';
            }
            char remove = arr[top];
            top = top-1;
            return remove;
        }

        public char peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return '\0';
            }
            return arr[top];
        }

        public boolean isFull(){
            return top == arr.length-1? true:false;
        }
        
        public boolean isEmpty(){
            return top == -1? true:false;
        }
    }

    // Check for matching pairs
    public static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static boolean isBalanced(String input){
        balanced_stack stack = new balanced_stack(input.length());
        for(int i = 0;i< input.length();i++){
            char ch = input.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}'){
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(!isMatching(top,ch))return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Expression: ");
        String input = sc.next();
        System.out.println("The given expression is "+ (isBalanced(input)?"Balanced":"Unbalanced"));
        sc.close();
    }
}
