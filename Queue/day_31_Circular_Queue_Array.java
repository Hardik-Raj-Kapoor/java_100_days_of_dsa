package Queue;

public class day_31_Circular_Queue_Array {
    private int[] arr;
    private int front, rear, size;

    public day_31_Circular_Queue_Array(int capacity){
        arr =new int[capacity];
        front =0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int n){
        if(size == arr.length){
            System.out.println("Queue is full");
            return;
        }
        rear = (rear+1)% arr.length;
        arr[rear] = n;
        size = size +1;
    }

    public int dequeue(){
        if(size == 0 ){
            System.out.println("Queue is empty");
            return -1;
        }
        int remove = arr[front];
        front = (front+1)% arr.length;
        size = size -1;
        return remove;
    }

    public int peek(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public void display(){
        if (size == 0) {
        System.out.println("Queue is empty");
        return;
    }

    System.out.print("Queue elements: ");
    for(int i = 0; i<size;i++){
        int index = (front+i)%arr.length;
        System.out.print(arr[index]+" ");
    }
    System.out.println();
    }
    public static void main(String[] args) {
        day_31_Circular_Queue_Array queue = new day_31_Circular_Queue_Array(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.peek());
        queue.display();
    }
}
