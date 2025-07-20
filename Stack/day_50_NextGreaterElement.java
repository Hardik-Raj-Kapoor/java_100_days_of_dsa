package Stack;

import java.util.Arrays;
class NextGreaterElement{
    static class Stack{
        int[] data;
        int top;
        int capacity;

        Stack(int size){
            capacity = size;
            data = new int[capacity];
            top = -1;
        }

        boolean isEmpty(){
            return top == -1;
        }

        void push(int val){
            if (top + 1 >= capacity){
                System.out.println("Stack Overflow");
                return;
            }
            data[++top] = val;
        }

        int pop(){
            if (isEmpty()){
                System.out.println("Stack Underflow");
                return -1;
            }
            return data[top--];
        }

        int peek(){
            if (isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return data[top];
        }
    }

    public int[] nextGreater(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack st = new Stack(n);

        for (int i = n - 1; i >= 0; i--){
            while (!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }

        return res;
    }
}
public class day_50_NextGreaterElement{
    public static void main(String[] args){
        NextGreaterElement obj = new NextGreaterElement();
        int[] arr = {4, 5, 2, 25};
        int[] res = obj.nextGreater(arr);
        System.out.println(Arrays.toString(res));
    }
}
