package Trees;
class Node{
    int data;
    Node left,right;
    Node(int Value){
        data = Value;
        right = left = null;
    }
}

class inorder{
    public void inordertraversal(Node node){
        if(node == null) return;
        inordertraversal(node.left);
        System.out.print(node.data+" ");
        inordertraversal(node.right);
    }
}

public class day_56_inorder {
    public static void main(String args[]){
        Node node = new Node(1);
        node.left= new Node(2);
        node.right = new Node(3);
        node.left.left= new Node(4);
        node.left.right = new Node(5);

        inorder tree = new inorder();
        tree.inordertraversal(node);
    }
}
