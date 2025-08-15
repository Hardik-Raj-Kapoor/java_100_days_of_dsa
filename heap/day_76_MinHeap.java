package heap;

class MINHEAP{
    private int[] heap;
    private int size;
    private int capacity;

    public MINHEAP(int capacity){
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    private int parent(int i){return (i-1)/2;}
    private int leftchild(int i){return 2*i+1;}
    private int rightchild(int i){return 2*i+2;}

    public void insert(int data){
        if(size == capacity){
            System.out.println("Heap is Full");
            return;
        }
        heap[size] = data;
        size = size+1;
        HeapifyUp(size-1);
    }

    private void HeapifyUp(int index){
        while(index>0 && heap[index]<heap[parent(index)]){
            swap(index,parent(index));
            index = parent(index);
        }
    }

    public int extractMin(){
        if(size == 0)throw new IllegalStateException("Heap is empty");
        int min = heap[0];
        heap[0] = heap[size-1];
        size = size - 1;
        HeapifyDown(0);
        return min;
    }

    private void HeapifyDown(int index){
        int smallest = index;
        int left = leftchild(index);
        int right = rightchild(index);

        if(left<size && heap[left]<heap[smallest]) smallest = left;
        if(right<size && heap[right]<heap[smallest]) smallest = right;

        if(smallest != index){
            swap(index,smallest);
            HeapifyDown(smallest);
        }
    }

    public int peek(){
        if(size == 0) throw new IllegalStateException("Heap is Empty");
        return heap[0];
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void printHeap(){
    for (int i = 0; i < size; i++) {
        System.out.print(heap[i] + " ");
    }
    System.out.println();
    }
}


public class day_76_MinHeap {
    public static void main(String[] args) {
        MINHEAP min = new MINHEAP(10);
        min.insert(53);
        min.insert(32);
        min.insert(83);
        min.insert(14);
        min.insert(12);
        min.insert(14);
        min.insert(14);
        System.out.print("Elements in Heap: ");min.printHeap();
        System.out.println("Min: "+ min.peek());
        System.out.println("Extracted Min: "+ min.extractMin());
        System.out.print("Elements in Heap after Extraction: ");min.printHeap();
        System.out.println("Min after Extraction: "+ min.peek());
    }
}
