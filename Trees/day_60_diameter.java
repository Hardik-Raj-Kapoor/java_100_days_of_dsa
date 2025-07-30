package Trees;

class diameter{
    int data;
    diameter left,right;
    diameter(int value){
        data = value;
        left = right = null;
    }
}

class DiameterTreeUtils {
    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int h, int d) {
            height = h;
            diameter = d;
        }
    }

    public static TreeInfo diameterOptimized(TreeNode node) {
        if (node == null) {
            return new TreeInfo(-1, 0);
        }

        TreeInfo left = diameterOptimized(node.left);
        TreeInfo right = diameterOptimized(node.right);

        int height = Math.max(left.height, right.height) + 1;
        int currentDiameter = left.height + right.height + 2;
        int diameter = Math.max(currentDiameter, Math.max(left.diameter, right.diameter));

        return new TreeInfo(height, diameter);
    }
}

public class day_60_diameter {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        DiameterTreeUtils.TreeInfo info = DiameterTreeUtils.diameterOptimized(root);
        System.out.println("Diameter of the tree: " + info.diameter);
    }
}
