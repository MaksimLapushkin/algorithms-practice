package algorithms.trees;

import static java.lang.Math.max;

public class TreeAlgorithm {
    public int maxDepth (TreeNode node){
        if (node == null)
                return 0;
        return 1 + max(maxDepth(node.left), maxDepth(node.right));
    }

    public boolean isSame (TreeNode node1, TreeNode node2){
        if ( node2 == null && node1 == null) {
            return true;
        }
        if ( node2 == null || node1 == null){
            return false;
        }
        return  (node1.val == node2.val &&
                isSame(node1.left,node2.left)&&
                isSame(node1.right,node2.right));

    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;

        return node1.val == node2.val
                && isMirror(node1.left, node2.right)
                && isMirror(node1.right, node2.left);
    }

    public boolean hasPathSum(TreeNode node, int target){
        if (node == null) return false;

        if (node.left == null && node.right == null) {
            return node.val == target;
        }
        return  hasPathSum(node.left, target-node.val)||hasPathSum(node.right, target-node.val);
    }
}
