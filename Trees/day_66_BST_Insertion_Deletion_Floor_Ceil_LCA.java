package Trees;

class BST{
    int data;
    BST left,right;
    BST(int value){
        data=value;
        left = right = null;
    }
}

class BST_op{
    BST root = null;
    public BST insert(BST node,int data){
        if(node == null) return new BST(data);
        if(data<node.data) node.left = insert(node.left,data);
        else if(data>node.data) node.right = insert(node.right,data);
        return node;
    }

    public BST delete(BST node,int data){
        if(node == null) return null;
        if(data<node.data) node.left =  delete(node.left,data);
        else if(data>node.data) node.right =  delete(node.right,data);
        else{
            if(node.right == null) return node.left;
            else if(node.left == null) return node.right;
            BST successor = findmin(node.right);
            node.data = successor.data;
            node.right = delete(node.right, successor.data);
        }
        return node;
    }
    BST findmin(BST node){
        while(node.left !=null) node = node.left;
        return node;
    }

    public int floor(BST node, int data){
        int res = -1;
        while(node != null){
            if(node.data == data) return node.data;
            if(node.data>data) node = node.left;
            else{
                res = node.data;
                node = node.right;
            }
        }
        return res;
    }

    public int ceil(BST node, int data){
        int res = -1;
        while(node != null){
            if(node.data == data) return node.data;
            if(node.data<data) node = node.right;
            else{
                res = node.data;
                node = node.left;
            }
        }
        return res;
    }

    public BST lowest_common_ancestor(BST node, int data_1, int data_2){
        if(node == null) return null;
        if(node.data>data_1 && node.data>data_2) return lowest_common_ancestor(node.left,data_1,data_2);
        if(node.data<data_1 && node.data<data_2) return lowest_common_ancestor(node.right,data_1,data_2);
        return node;
    }
}


public class day_66_BST_Insertion_Deletion_Floor_Ceil_LCA{
    static void inorder(BST node){
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    public static void main(String[] args){
        BST_op tree = new BST_op();
        int[] values = {20, 10, 30, 5, 15, 25, 35};

        // Inserting nodes
        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        // Display inserted tree in Inorder
        System.out.print("Inorder after insertion: ");
        inorder(tree.root);
        System.out.println();

        // Delete node
        tree.root = tree.delete(tree.root, 10);
        System.out.print("Inorder after deleting 10: ");
        inorder(tree.root);
        System.out.println();

        // Floor and Ceil
        int key = 28;
        int floor = tree.floor(tree.root, key);
        int ceil = tree.ceil(tree.root, key);
        System.out.println("Floor of " + key + ": " + (floor == -1 ? "None" : floor));
        System.out.println("Ceil of " + key + ": " + (ceil == -1 ? "None" : ceil));

        // Lowest Common Ancestor
        int n1 = 5, n2 = 15;
        BST lca = tree.lowest_common_ancestor(tree.root, n1, n2);
        if (lca != null)
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + lca.data);
        else
            System.out.println("LCA not found.");
    }

}
