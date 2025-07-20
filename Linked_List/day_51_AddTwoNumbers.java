package Linked_List;
public class day_51_AddTwoNumbers {
    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    static Node add(Node l1, Node l2) {
        Node dummy = new Node(0), curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            curr.next = new Node(sum % 10);
            carry = sum / 10;
            curr = curr.next;
        }
        return dummy.next;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        Node result = add(l1, l2);
        print(result); // 7 0 8
    }
}
