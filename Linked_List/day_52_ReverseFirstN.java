package Linked_List;

public class day_52_ReverseFirstN {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    static Node reverseFirstN(Node head, int n) {
        if (n == 0 || head == null) return head;

        Node prev = null, curr = head, next = null;
        Node tail = head;

        for (int i = 0; i < n && curr != null; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        tail.next = curr;
        return prev;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = reverseFirstN(head, 2);
        print(head); // 20 10 30 40
    }
}
