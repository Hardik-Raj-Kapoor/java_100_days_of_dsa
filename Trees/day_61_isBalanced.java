package Trees;

class isBalanced{
    int data;
    isBalanced left,right;
    isBalanced(int value){
        data = value;
        left=right=null;
    }
}

class isBalanced_TreeUtils{
    static class Balanced_Status{
        boolean isBalanced;
        int Height;
        Balanced_Status(boolean balanced, int h) {
            isBalanced = balanced;
            Height = h;
        }
    }
    public static Balanced_Status isBalancedOptimized(isBalanced node){
        if (node == null) {
            return new Balanced_Status(true, -1);
        }

        Balanced_Status left = isBalancedOptimized(node.left);
        Balanced_Status right = isBalancedOptimized(node.right);

        boolean balanced = left.isBalanced && right.isBalanced && Math.abs(left.Height - right.Height) <= 1;
        int height = Math.max(left.Height, right.Height) + 1;

        return new Balanced_Status(balanced, height);
    }
}

public class day_61_isBalanced {
    public static void main(String[] args) {
        isBalanced root = new isBalanced(1);
        root.left = new isBalanced(2);
        root.right = new isBalanced(3);
        root.left.left = new isBalanced(4);

        isBalanced_TreeUtils.Balanced_Status status = isBalanced_TreeUtils.isBalancedOptimized(root);
        System.out.println("Is tree balanced? " + status.isBalanced);

        isBalanced unbalancedRoot = new isBalanced(1);
        unbalancedRoot.left = new isBalanced(2);
        unbalancedRoot.left.left = new isBalanced(3);

        isBalanced_TreeUtils.Balanced_Status unbalancedStatus = isBalanced_TreeUtils.isBalancedOptimized(unbalancedRoot);
        System.out.println("Is tree balanced? " + unbalancedStatus.isBalanced);
    }
}
