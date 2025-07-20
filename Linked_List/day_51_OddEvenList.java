package Linked_List;

public class day_51_OddEvenList {
    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    static Node oddEvenList(Node head) {
        if (head == null || head.next == null) return head;

        Node odd = head, even = head.next, evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = oddEvenList(head);
        print(head); // 1 3 5 2 4
    }
}
