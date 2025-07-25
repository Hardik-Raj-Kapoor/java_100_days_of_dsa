package Trees;
class Node{
    int data;
    Node left,right;
    Node(int value){
        data = value;
        right = left = null;
    }
} 

class PreorderTraversal{
    void preTrav(Node node){
        if(node == null) return;

        System.out.print(node.data+" ");
        preTrav(node.left);
        preTrav(node.right);
    }
}

public class day_55_preorder{
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        PreorderTraversal tree = new PreorderTraversal();
        tree.preTrav(root);
     }
}