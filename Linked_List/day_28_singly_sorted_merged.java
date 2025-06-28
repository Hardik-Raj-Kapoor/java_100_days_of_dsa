package Linked_List;

public class day_28_singly_sorted_merged {
    static class Node {
        int Data;
        Node next;
        Node(int Data) { this.Data = Data; }
    }

    Node Head;

    // Insert at end
    public void insert(int Data) {
        Node newNode = new Node(Data);
        if (Head == null) { Head = newNode; return; }
        Node temp = Head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // Middle node
    public void findMiddle() {
        Node slow = Head, fast = Head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle: " + (slow != null ? slow.Data : "null"));
    }

    // Detect cycle
    public boolean detectCycle() {
        Node slow = Head, fast = Head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    // Merge
    static Node merging(Node l1, Node l2) {
        Node dummy = new Node(0), tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.Data < l2.Data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    public void printing(){
        Node curr = Head;
        while(curr != null){
            System.out.print(curr.Data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    static void printList(Node head) {
    while (head != null) {
        System.out.print(head.Data + " -> ");
        head = head.next;
    }
    System.out.println("null");
}

    public static void main(String args[]){
        day_28_singly_sorted_merged list1 = new day_28_singly_sorted_merged();
        day_28_singly_sorted_merged list2 = new day_28_singly_sorted_merged();
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
