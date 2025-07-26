package Trees;

class post_node{
    int data;
    post_node right,left;
    post_node(int value){
        data = value;
        left = right = null;
    }
}

class posstorder{
    public void postordertraversal(post_node node){
        if(node == null) return;
        postordertraversal(node.left);
        postordertraversal(node.right);
        System.out.print(node.data + " ");
    }
}

public class day_56_postorder{
    public static void main(String[] args){
        post_node node = new post_node(1);
        node.left = new post_node(2);
        node.right = new post_node(3);
        node.left.left = new post_node(4);
        node.left.right = new post_node(5);
        posstorder tree =new posstorder();
        tree.postordertraversal(node);
    }
}
