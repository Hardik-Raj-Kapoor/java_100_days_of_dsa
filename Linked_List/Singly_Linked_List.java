package Linked_List;

public class Singly_Linked_List {
class Node{
    int Data;
    Node Next;

    Node(int Data){
        this.Data = Data;
    }
}

Node Head;

public void add_end(int Data){
    Node new_node = new Node(Data);
    if(Head == null){
        Head = new_node;
        return;
    }

    Node curr = Head;
    while(curr.Next != null){
        curr = curr.Next;
    }
    curr.Next = new_node;
}

public void delete_element(int Key){
    if(Head == null){
        return;
    }

    if(Head.Data == Key){
        Head = Head.Next;
        return;
    }

    Node curr = Head;

    while (curr.Next != null && curr.Next.Data !=Key) {
        curr = curr.Next;        
    }
    if(curr.Next != null){
        curr.Next = curr.Next.Next;
    }
}

//searching element
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

//reversing the list
public void reversing(){
    Node prev = null;
    Node curr = Head;
    Node next = null;

    while(curr !=null){
        next = curr.Next;
        curr.Next = prev;
        prev = curr;
        curr = next;
    }
    Head = prev;
}

//insert at position
public void insert_at_position(int Data, int position){
    Node new_node = new Node(Data);

    if(position==0){
        new_node.Next = Head;
        Head= new_node;
        return;
    }

    Node curr = Head;
    int index = 0;
    while(curr != null && index<position-1){
        curr = curr.Next;
        index++;
    }
    
    if (curr == null){
        System.out.println("Position out of bound");
        return;
    }

    new_node.Next = curr.Next;
    curr.Next = new_node;
}


// Print the list
    public void printList() {
        Node curr = Head;
        while (curr != null) {
            System.out.print(curr.Data + " -> ");
            curr = curr.Next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        Singly_Linked_List list = new Singly_Linked_List();
        list.add_end(10);
        list.add_end(20);
        list.add_end(30);
        list.printList(); // 10 -> 20 -> 30 -> null
        list.delete_element(20);
        System.out.println(list.search(20));
        list.printList(); // 10 -> 30 -> null
        list.reversing();
        list.printList();
        list.insert_at_position(20, 1);
        list.printList();
    }
}