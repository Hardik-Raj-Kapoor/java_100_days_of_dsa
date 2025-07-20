package Linked_List;

public class day_51_DeleteNode {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    static Node deleteByValue(Node head, int val) {
        if (head == null) return null;
        if (head.data == val) return head.next;

        Node temp = head;
        while (temp.next != null && temp.next.data != val) {
            temp = temp.next;
        }
        if (temp.next != null)
            temp.next = temp.next.next;
        return head;
    }

    static Node deleteByPosition(Node head, int pos) {
        if (pos == 0) return head.next;
        Node temp = head;
        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp != null && temp.next != null)
            temp.next = temp.next.next;
        return head;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = deleteByValue(head, 2);     // deletes node with value 2
        head = deleteByPosition(head, 1);  // deletes node at index 1 (value 3)
        print(head); // Output: 1 4
    }
}
