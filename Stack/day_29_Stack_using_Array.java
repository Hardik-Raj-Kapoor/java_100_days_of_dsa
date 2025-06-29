package Stack;

public class day_29_Stack_using_Array {
    static class StackArray{
        private int[] stack;
        private int capacity;
        private int top;

        
        //constructor
        public StackArray(int size){
            capacity = size;
            stack = new int[capacity];
            top = -1;
        }

        //inserting element
        public void push(int value){
            if(top==capacity-1){
                System.out.println("Stack Overflow");
                return;
            }
            top = top+1;
            stack[top] = value;
        }

        //deleting top element
        public int pop(){
            if(isEmpty()){//top == -1 (True or False)
                System.out.println("Stack Underflow");
                return -1;
            }
            int value = stack[top];
            top = top-1;
            return value;
        }

        //view top element
        public int peek(int value){
            if(isEmpty()){//top == -1 (True or False)
                return -1;
            }
            return stack[top];
        }

        public boolean isEmpty(){
            return top ==-1;
        }

        public int size(){
            return top +1;
        }

        public void display(){
            for(int i=top;i>=0;i--){
                System.out.print(stack[i]+ " ");
            }
        }
    }
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        stack.pop();
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek(10));
        System.out.println(stack.size());
        stack.display();
    }
    public void push(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }
}
