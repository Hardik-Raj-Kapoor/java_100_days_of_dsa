package Linked_List;

public class Singly_Circular_Linked_List {
    class Node {
        int Data;
        Node Next;
        Node(int Data) {
            this.Data = Data;
        }
    }

    Node Head = null, Tail = null;

    // Insert at end
    public void add_end(int Data) {
        Node new_node = new Node(Data);
        if (Head == null) {
            Head = Tail = new_node;
            new_node.Next = Head;  // Circular link
        } else {
            Tail.Next = new_node;
            Tail = new_node;
            Tail.Next = Head;
        }
    }

    // Insert at a given position (1-based index)
    public void insertAtPosition(int Data, int position) {
        Node new_node = new Node(Data);
        if (position < 1) {
            System.out.println("Invalid position!");
            return;
        }

        if (position == 1) {  // Insert at beginning
            if (Head == null) {
                Head = Tail = new_node;
                new_node.Next = Head;
            } else {
                new_node.Next = Head;
                Head = new_node;
                Tail.Next = Head;
            }
            return;
        }

        Node temp = Head;
        int count = 1;
        while (count < position - 1 && temp.Next != Head) {
            temp = temp.Next;
            count++;
        }

        if (count != position - 1) {
            System.out.println("Position out of range!");
            return;
        }

        new_node.Next = temp.Next;
        temp.Next = new_node;
        if (temp == Tail) {
            Tail = new_node;
        }
    }

    // delete_element node by value
    public void delete_element(int key) {
        if (Head == null) return;

        Node curr = Head, prev = Tail;
        do {
            if (curr.Data == key) {
                // Only one node
                if (Head == Tail) {
                    Head = Tail = null;
                }
                // Deleting Head
                else if (curr == Head) {
                    Head = Head.Next;
                    Tail.Next = Head;
                }
                // Deleting Tail
                else if (curr == Tail) {
                    Tail = prev;
                    Tail.Next = Head;
                }
                // Deleting middle node
                else {
                    prev.Next = curr.Next;
                }
                return;
            }
            prev = curr;
            curr = curr.Next;
        } while (curr != Head);

        System.out.println("Value " + key + " not found.");
    }

    // Search for a value
    public boolean search(int key) {
        if (Head == null) return false;

        Node temp = Head;
        do {
            if (temp.Data == key) return true;
            temp = temp.Next;
        } while (temp != Head);

        return false;
    }

    // Print the list
    public void printList() {
        if (Head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = Head;
        do {
            System.out.print(temp.Data + " -> ");
            temp = temp.Next;
        } while (temp != Head);
        System.out.println("(back to Head)");
    }

    // Main method to test the functions
    public static void main(String[] args) {
        Singly_Circular_Linked_List list = new Singly_Circular_Linked_List();

        // Insert at end
        list.add_end(10);
        list.add_end(20);
        list.add_end(30);
        list.printList();

        // Insert at position
        list.insertAtPosition(5, 1);
        list.insertAtPosition(25, 4);
        list.insertAtPosition(35, 10);
        list.printList();

        // Search
        System.out.println("Search 25: " + list.search(25));
        System.out.println("Search 100: " + list.search(100));

        // delete_element nodes
        list.delete_element(5);
        list.delete_element(30);
        list.delete_element(100);
        list.printList();
    }
}
