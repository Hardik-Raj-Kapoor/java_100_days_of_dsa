package Stack;

class ReverseStack {
    int[] data;
    int top;
    int capacity;

    ReverseStack(int size) {
        capacity = size;
        data = new int[capacity];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int val) {
        if (top + 1 >= capacity) {
            System.out.println("Stack Overflow");
            return;
        }
        data[++top] = val;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return data[top--];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return data[top];
    }

    void printStack() {
        System.out.print("Reversed Stack: [");
        for (int i = 0; i <= top; i++) {
            System.out.print(data[i]);
            if (i != top) System.out.print(", ");
        }
        System.out.println("]");
    }
}

public class day_50_ReverseStack {

    static void insertAtBottom(ReverseStack st, int val) {
        if (st.isEmpty()) {
            st.push(val);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, val);
        st.push(top);
    }

    static void reverse(ReverseStack st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        reverse(st);
        insertAtBottom(st, top);
    }

    public static void main(String[] args) {
        ReverseStack obj = new ReverseStack(100);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        reverse(obj);
        obj.printStack();  // Output: Reversed Stack: [1, 2, 3]
    }
}
