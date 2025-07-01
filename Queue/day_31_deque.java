package Queue;

public class day_31_deque {
    private int[] arr;
    private int front, rear, size;

    public day_31_deque(int capacity){
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public void rear_enqueue(int n){
        if(size == arr.length){
            System.out.println("Queue is full");
            return;
        }
        rear = (rear+1)%arr.length;
        arr[rear] = n;
        size = size +1;
    }

    public void front_enqueue(int n){
        if(size == arr.length){
            System.out.println("Queue is full");
            return;
        }
        front = (front-1+arr.length) %arr.length;
        arr[front] = n;
        size = size+1;
    }

    public int front_dequeue(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        int remove = arr[front];
        front = (front+1)%arr.length;
        size = size -1;
        return remove;
    }

    public int rear_dequeue(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int remove = arr[rear];
        rear = (rear-1+arr.length)%arr.length;
        size = size -1;
        return remove;
    }

    public void display(){
        if(size == 0){
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Deque elements: ");
        for(int i = 0;i<size;i++){
            int index = (front+i)% arr.length;
            System.out.print(arr[index]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        day_31_deque deque = new day_31_deque(6);
        deque.front_enqueue(10);
        deque.front_enqueue(20);
        deque.rear_enqueue(30);
        deque.display();
        deque.front_enqueue(40);
        deque.front_enqueue(50);
        deque.rear_enqueue(60);
        deque.display();
        
        deque.front_dequeue();
        deque.rear_dequeue();
        deque.display();
    }
    
    
}
