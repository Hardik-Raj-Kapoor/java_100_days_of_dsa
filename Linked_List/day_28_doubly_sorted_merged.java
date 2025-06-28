package Linked_List;

public class day_28_doubly_sorted_merged {
    static class Node {
        int Data;
        Node Prev, Next;
        Node(int Data) { this.Data = Data; }
    }

    Node Head;

    void insert(int Data) {
        Node newNode = new Node(Data);
        if (Head == null) { Head = newNode; return; }
        Node temp = Head;
        while (temp.Next != null) temp = temp.Next;
        temp.Next = newNode;
        newNode.Prev = temp;
    }

    void findMiddle() {
        Node slow = Head, fast = Head;
        while (fast != null && fast.Next != null) {
            slow = slow.Next;
            fast = fast.Next.Next;
        }
        System.out.println("Middle: " + (slow != null ? slow.Data : "null"));
    }


    boolean detectCycle() {
        Node slow = Head, fast = Head;
        while (fast != null && fast.Next != null) {
            slow = slow.Next;
            fast = fast.Next.Next;
            if (slow == fast) return true;
        }
        return false;
    }

    static Node merging(Node l1, Node l2) {
        Node dummy = new Node(0), tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.Data < l2.Data) {
                tail.Next = l1;
                l1.Prev = tail;
                l1 = l1.Next;
            } else {
                tail.Next = l2;
                l2.Prev = tail;
                l2 = l2.Next;
            }
            tail = tail.Next;
        }
        Node rem = (l1 != null) ? l1 : l2;
        tail.Next = rem;
        if (rem != null) rem.Prev = tail;
        return dummy.Next;
    }

    public void printing(){
        Node curr = Head;
        while(curr != null){
            System.out.print(curr.Data + "<->");
            curr = curr.Next;
        }
        System.out.println("null");
    }
    static void printList(Node head) {
    while (head != null) {
        System.out.print(head.Data + " <-> ");
        head = head.Next;
    }
    System.out.println("null");
}
    public static void main(String args[]){
        day_28_doubly_sorted_merged list1 = new day_28_doubly_sorted_merged();
        day_28_doubly_sorted_merged list2 = new day_28_doubly_sorted_merged();
        list1.insert(10);
        list2.insert(20);
        list1.insert(30);
        list2.insert(40);
        list1.insert(50);
        list2.insert(60);
        list1.printing();
        list2.printing();
        list1.findMiddle();
        list2.findMiddle();
        System.out.println(list1.detectCycle());
        System.out.println(list2.detectCycle());
        Node mergedHead = merging(list1.Head, list2.Head);
        printList(mergedHead);
        
    }

}
