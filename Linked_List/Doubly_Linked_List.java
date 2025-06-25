package Linked_List;

public class Doubly_Linked_List {
    class Node{
        int Data;
        Node Next;
        Node Prev;
        Node(int Data){
            this.Data = Data;
        }
    }

    Node Head;Node Tail;

    //Insert at the end
    public void add_end(int Data){
        Node new_node = new Node(Data);
        if(Head == null){
            Head = Tail = new_node;
            return;
        }
        Tail.Next = new_node;
        new_node.Prev = Tail;
        Tail = new_node;
    }

    // deleting first occurrence of a key
public void delete_element(int Key){
    Node curr = Head;
    while(curr != null && curr.Data != Key){
        curr = curr.Next;
    }

    if(curr == null) return; // Key not found

    if(curr == Head){
        Head = curr.Next;
        if(Head != null){
            Head.Prev = null;
        } 
        else {
            Tail = null; // List became empty
        }
    } 
    
    else if(curr == Tail){
        Tail = curr.Prev;
        if(Tail != null){
            Tail.Next = null;
        }
    } 
    
    else {
        curr.Prev.Next = curr.Next;
        curr.Next.Prev = curr.Prev;
    }
}


//searching
public boolean search(int Key){
    Node curr = Head;
    while(curr != null){
        if(curr.Data == Key){
            return true;
        }
        curr = curr.Next;
    }
    return false;
}



//reversing List
public void reverseList() {
    Node curr = Head;
    Node temp = null;

    // Swap next and prev for each node
    while (curr != null) {
        temp = curr.Prev;
        curr.Prev = curr.Next;
        curr.Next = temp;
        curr = curr.Prev; // move to "next" (originally prev)
    }

    // Swap Head and Tail
    if (temp != null) {
        Head = temp.Prev;
    }
}


//Inserting at certain position
public void insertAtPosition(int position, int Data) {
    Node new_node = new Node(Data);
    
    // Case: insert at beginning (position 0)
    if (position == 0) {
        new_node.Next = Head;
        if (Head != null) {
            Head.Prev = new_node;
        }
        Head = new_node;
        if (Tail == null) {
            Tail = new_node;
        }
        return;
    }

    Node curr = Head;
    int index = 0;

    // Traverse to (position - 1)
    while (curr != null && index < position - 1) {
        curr = curr.Next;
        index++;
    }

    // Position out of bounds
    if (curr == null) {
        System.out.println("Position out of bounds");
        return;
    }

    new_node.Next = curr.Next;
    new_node.Prev = curr;

    if (curr.Next != null) {
        curr.Next.Prev = new_node;
    } else {
        Tail = new_node; // inserting at end
    }

    curr.Next = new_node;
}



    // Print list forward
    public void printForward() {
        Node curr = Head;
        while (curr != null) {
            System.out.print(curr.Data + " <-> ");
            curr = curr.Next;
        }
        System.out.print("null");
    }

    // Print list Backwards
    public void printBackward(){
        Node curr = Tail;
        while(curr != null){
            System.out.print(curr.Data + " <-> ");  
            curr = curr.Prev;     
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
    Doubly_Linked_List list = new Doubly_Linked_List();

    list.add_end(10);
    list.add_end(20);
    list.add_end(30);

    // Insert at position
    list.insertAtPosition(1, 15); // List: 10 <-> 15 <-> 20 <-> 30

    // Search
    System.out.println("Search 15: " + list.search(15)); // true
    System.out.println("Search 50: " + list.search(50)); // false

    // Print
    list.printForward(); // 10 <-> 15 <-> 20 <-> 30 <-> null

    // Reverse and print
    list.reverseList();
    list.printForward(); // 30 <-> 20 <-> 15 <-> 10 <-> null
}

}
