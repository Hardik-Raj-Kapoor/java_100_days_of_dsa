package Linked_List;

public class Doubly_Circular_Linked_List {
    class Node {
        int Data;
        Node Next, Prev;
        Node(int Data) {
            this.Data = Data;
        }
    }

    Node Head = null;

    // 1. Insert at End
    public void add_end(int Data) {
        Node new_node = new Node(Data);
        if (Head == null) {
            new_node.Next = new_node.Prev = new_node;
            Head = new_node;
        } else {
            Node tail = Head.Prev;
            tail.Next = new_node;
            new_node.Prev = tail;
            new_node.Next = Head;
            Head.Prev = new_node;
        }
    }

    // 2. Insert at Position (1-based index)
    public void insertAtPosition(int Data, int position) {
        Node new_node = new Node(Data);
        if (position <= 1 || Head == null) {
            if (Head == null) {
                new_node.Next = new_node.Prev = new_node;
                Head = new_node;
            } else {
                Node tail = Head.Prev;
                new_node.Next = Head;
                new_node.Prev = tail;
                tail.Next = new_node;
                Head.Prev = new_node;
                Head = new_node;
            }
            return;
        }

        Node curr = Head;
        int count = 1;
        while (count < position - 1 && curr.Next != Head) {
            curr = curr.Next;
            count++;
        }

        Node NextNode = curr.Next;
        curr.Next = new_node;
        new_node.Prev = curr;
        new_node.Next = NextNode;
        NextNode.Prev = new_node;
    }

    // 3. Delete by Value
    public void delete_element(int key) {
        if (Head == null) return;

        Node curr = Head;
        do {
            if (curr.Data == key) {
                if (curr.Next == curr) {
                    Head = null;
                } else {
                    curr.Prev.Next = curr.Next;
                    curr.Next.Prev = curr.Prev;
                    if (curr == Head)
                        Head = curr.Next;
                }
                return;
            }
            curr = curr.Next;
        } while (curr != Head);
    }

    // 4. Search for Value
    public boolean search(int key) {
        if (Head == null) return false;
        Node curr = Head;
        do {
            if (curr.Data == key)
                return true;
            curr = curr.Next;
        } while (curr != Head);
        return false;
    }

    // 5. Print List (Forward Traversal)
    public void printForward() {
        if (Head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node curr = Head;
        do {
            System.out.print(curr.Data + " <-> ");
            curr = curr.Next;
        } while (curr != Head);
        System.out.println("(back to Head)");
    }

    // 6. Reverse Traversal
    public void printBackward() {
        if (Head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node tail = Head.Prev;
        Node curr = tail;
        do {
            System.out.print(curr.Data + " <-> ");
            curr = curr.Prev;
        } while (curr != tail);
        System.out.println("(back to tail)");
    }

    // Main to test
    public static void main(String[] args) {
        Doubly_Circular_Linked_List list = new Doubly_Circular_Linked_List();
        
        list.add_end(10);
        list.add_end(20);
        list.add_end(30);
        list.printForward();   // 10 <-> 20 <-> 30 <-> (back to Head)

        list.insertAtPosition(5, 1);  // Insert at Head
        list.insertAtPosition(25, 4); // Insert in middle
        list.printForward();   // 5 <-> 10 <-> 20 <-> 25 <-> 30 <-> (back to Head)

        list.delete_element(10);
        list.printForward();   // 5 <-> 20 <-> 25 <-> 30 <-> (back to Head)

        System.out.println("Search 25: " + list.search(25)); // true
        System.out.println("Search 99: " + list.search(99)); // false

        list.printBackward();  // 30 <-> 25 <-> 20 <-> 5 <-> (back to tail)
    }
}
