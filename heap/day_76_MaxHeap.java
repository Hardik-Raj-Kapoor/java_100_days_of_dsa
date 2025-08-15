package heap;

class MAXHEAP{
    private int[] heap;
    private int size;
    private int capacity;

    public MAXHEAP(int capacity){
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
        while(index > 0 && heap[index]>heap[parent(index)]){
            swap(index,parent(index));
            index = parent(index);
        }
    }

    public int extractMax(){
        if(size ==0) throw new IllegalStateException("Heap is empty");
        int max = heap[0];
        heap[0] = heap[size-1];
        size = size -1;
        HeapifyDown(0);
        return max;
    }

    private void HeapifyDown(int index){
        int largest = index;
        int left = leftchild(index);
        int right = rightchild(index);

        if(left<size && heap[left]> heap[largest]) largest = left;
        if(right<size && heap[right]>heap[largest]) largest = right;

        if(largest != index){
            swap(index,largest);
            HeapifyDown(largest);
        }
    }

    public int peek(){
        if(size == 0) throw new IllegalStateException("Heap is Empty");
        return heap[0];
    }

    private void swap(int i,int j){
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
public class day_76_MaxHeap {
    public static void main(String[] args) {
        MAXHEAP max = new MAXHEAP(10);
        max.insert(53);
        max.insert(22);
        max.insert(56);
        max.insert(75);
        max.insert(35);
        max.insert(78);
        System.out.print("Elements in Heap: ");max.printHeap();
        System.out.println("Max: "+ max.peek());
        System.out.println("Extracted Max: "+ max.extractMax());
        System.out.print("Elements in Heap after Extraction: ");max.printHeap();
        System.out.println("Max after Extraction: "+ max.peek());
    }
}
