package Queue;

public class day_30_Queue_using_Array {

    private int arr[];
    private int front, rear, size;

    public day_30_Queue_using_Array(int capacity){
        arr = new int[capacity];
        front = 0;
        rear =-1;
        size = 0;
    }

    public void Enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        rear = rear +1;
        arr[rear]= data;
        size = size +1;
    }

    public int Dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int temp = arr[front];
        front = front+1;
        size = size-1;
        return temp;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        else{
            return arr[front];
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length-1;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[front + i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Create a queue of capacity 5
        day_30_Queue_using_Array queue = new day_30_Queue_using_Array(5);

        // Enqueue elements
        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Enqueue(40);
        queue.Enqueue(50);

        // Display queue
        queue.display();

        // Try to enqueue when full
        queue.Enqueue(60);

        // Dequeue two elements
        System.out.println("Dequeued: " + queue.Dequeue());
        System.out.println("Dequeued: " + queue.Dequeue());

        // Display again
        queue.display();

        // Peek front element
        System.out.println("Front element: " + queue.peek());

        // Enqueue again (will fail due to linear logic)
        queue.Enqueue(60); 

        // Final state
        queue.display();
    }
}
