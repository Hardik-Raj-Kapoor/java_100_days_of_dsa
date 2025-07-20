package Linked_List;

public class day_51_RotateList {
    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    static Node rotateRight(Node head, int k) {
        if (head == null || k == 0) return head;

        // Compute length
        Node temp = head;
        int len = 1;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        k = k % len;
        if (k == 0) return head;

        temp.next = head; // make circular
        int steps = len - k;
        Node newTail = temp;

        while (steps-- > 0) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;
        newTail.next = null;
        return newHead;
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

        head = rotateRight(head, 2);
        print(head); // 4 5 1 2 3
    }
}
