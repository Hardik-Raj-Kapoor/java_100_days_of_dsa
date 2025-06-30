package Queue;

public class day_30_Queue_using_LinkedList {
    class Node {
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
        }
    }

    private Node front, rear;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        return removed;
    }

    public int peek() {
        if (isEmpty()) return -1;
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Create an instance of the queue
        day_30_Queue_using_LinkedList queue = new day_30_Queue_using_LinkedList();

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Display queue
        queue.display(); 

        // Peek front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue two elements
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        // Display again
        queue.display();

        // Dequeue last element
        System.out.println("Dequeued: " + queue.dequeue());

        // Try to dequeue from empty queue
        System.out.println("Dequeued: " + queue.dequeue()); 

        // Display after all operations
        queue.display();
    }
}
