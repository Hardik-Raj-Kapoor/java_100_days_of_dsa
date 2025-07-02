package Queue;

public class day_32_priority_queue {
        int[] heap;
        int size, capacity;
        day_32_priority_queue(int capacity){
            this.capacity = capacity;
            heap = new int[capacity];
            size = 0;
        }
        public void enqueue(int n){
            if(size == heap.length){
                System.out.println("Queue is full");
                return;
            }
            heap[size] = n;
            heapifyup(size);
            size++;
        }

        public void heapifyup(int index){
            while(index > 0){
                int parent = (index-1)/2;
                if(heap[index]<heap[parent]){
                    swap(index,parent);
                    index=parent;
                }
                else break;
            }
        }

        public int dequeue(){
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            int min = heap[0];
            heap[0] = heap[size-1];
            size = size -1;
            heapifydown(0);
            return min;
        }

        public void heapifydown(int index){
            while(index < size){
                int left = 2*index+1;
                int right = 2*index+2;
                int smallest = index;
                if(left<size && heap[left]<heap[smallest]) smallest = left;
                if(right<size && heap[right]<heap[smallest]) smallest = right;
                
                if(smallest != index){
                    swap(index,smallest);
                    index = smallest;
                }
                else break;
            }
        }
        private void swap(int i, int j){
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }

        public int peek(){
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            return heap[0];
        }

        public void display() {
            if (size == 0) {
                System.out.println("Priority Queue is empty");
                return;
        }

            System.out.print("Priority Queue elements (Min-Heap): ");
            for (int i = 0; i < size; i++) {
                System.out.print(heap[i] + " ");
            }
            System.out.println();
            }
    public static void main(String[] args) {
        day_32_priority_queue pq = new day_32_priority_queue(10);

        pq.enqueue(30);
        pq.enqueue(10);
        pq.enqueue(20);
        pq.enqueue(5);
        pq.display();
        System.out.println("Peek: " + pq.peek()); 
        System.out.println("Dequeued: " + pq.dequeue()); 
        System.out.println("Peek after dequeue: " + pq.peek());
        pq.display();
    }
}
