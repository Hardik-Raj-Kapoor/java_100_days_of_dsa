package Stack;

class MinStack{
    int[] stack;
    int[] minStack;
    int top;
    int minTop;
    int capacity;

    public MinStack(){
        capacity = 1000;
        stack = new int[capacity];
        minStack = new int[capacity];
        top = -1;
        minTop = -1;
    }

    public void push(int val){
        if (top + 1 >= capacity){
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = val;

        if (minTop == -1 || val <= minStack[minTop]){
            minStack[++minTop] = val;
        }
    }

    public void pop(){
        if (top == -1){
            System.out.println("Stack Underflow");
            return;
        }

        int removed = stack[top--];

        if (removed == minStack[minTop]){
            minTop--;
        }
    }

    public int top(){
        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public int getMin(){
        if (minTop == -1){
            System.out.println("Min Stack is empty");
            return -1;
        }
        return minStack[minTop];
    }
}


public class day_50_MinStack{
    public static void main(String[] args){
        MinStack obj = new MinStack();
        obj.push(5);
        obj.push(3);
        obj.push(7);
        System.out.println("Min: " + obj.getMin());
        obj.pop();
        System.out.println("Top: " + obj.top());
        System.out.println("Min: " + obj.getMin());
    }
}
