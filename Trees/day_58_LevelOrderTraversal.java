package Trees;

class TreeNode{
    int data;
    TreeNode right,left;

    TreeNode(int Value){
        data = Value;
        right=left=null;
    }
}

class QueueNode{
    TreeNode treenode;
    QueueNode next;

    QueueNode(TreeNode node){
        treenode = node;
        next = null;
    }
}

class MyQueue{
    QueueNode front,rear;

    MyQueue(){
        front=rear=null;
    }

    void enqueue(TreeNode node){
        QueueNode newNode = new QueueNode(node);
        if(rear==null){
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear = newNode;
    }

    TreeNode dequeue() {
        if (front == null)
            return null;

        QueueNode temp = front;
        front = front.next;

        if (front == null)
            rear = null;

        return temp.treenode;
    }

    boolean isEmpty() {
        return front == null;
    }
}

public class day_58_LevelOrderTraversal {
    TreeNode root;

    void levelOrder() {
        if (root == null) return;

        MyQueue queue = new MyQueue();
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.dequeue();
            System.out.print(currentNode.data + " ");

            if (currentNode.left != null) queue.enqueue(currentNode.left);

            if (currentNode.right != null) queue.enqueue(currentNode.right);
        }
    }

    public static void main(String[] args) {
        day_58_LevelOrderTraversal tree = new day_58_LevelOrderTraversal();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Level order traversal of binary tree is: ");
        tree.levelOrder();
    }
}
