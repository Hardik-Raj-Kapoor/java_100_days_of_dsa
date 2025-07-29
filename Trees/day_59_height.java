package Trees;
import java.lang.Math;
class Height{
    int data;
    Height left,right;
    Height(int Value){
        data = Value;
        left=right=null;
    }
}

public class day_59_height {
    public static int height(Height node){
        if(node == null) return -1;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight)+1;
    }

    public static void main(String args[]) {
        Height root = new Height(1);
        root.left = new Height(2);
        root.right = new Height(3);
        root.left.left = new Height(4);
        root.left.right = new Height(5);
        int treeHeight = day_59_height.height(root);
        System.out.println("Height of Tree: "+treeHeight);   
    }
}
