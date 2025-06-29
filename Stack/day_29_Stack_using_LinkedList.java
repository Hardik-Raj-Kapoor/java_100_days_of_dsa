package Stack;

public class day_29_Stack_using_LinkedList {
    private class Node{
        int data;
        Node next;
        Node(int data){this.data = data;}
    }
    private Node top;


    //inserting element
    public void push(int value){
        Node new_node = new Node(value);
        new_node.next = top;
        top = new_node;
    }


    //deleting top element
    public int pop(){
        if(isEmpty()){ // top == null (True or False)
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    //view top element
    public int peek(){
        if(isEmpty()){ // top == null (True or False)
            System.out.println("Stack Underflow");
            return -1;
        }
        return top.data;
    }
    
    public boolean isEmpty(){
        return top == null;
    }

    public int size(){
        int count = 0;
        Node curr = top;
        while (curr != null) {
            count = count+1;
            curr = curr.next;            
        }
        return count;
    }

    public void display(){
        Node curr = top;
        while (curr!=null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        day_29_Stack_using_LinkedList Stack = new day_29_Stack_using_LinkedList();
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        Stack.push(40);
        Stack.push(50);
        Stack.display();
        Stack.pop();
        System.out.println(Stack.isEmpty());
        System.out.println(Stack.peek());
        System.out.println(Stack.size());
        Stack.display();
    }
}
