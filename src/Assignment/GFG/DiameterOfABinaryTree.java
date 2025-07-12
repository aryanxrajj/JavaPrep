package Assignment.GFG;

import com.sun.source.tree.Tree;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class DiameterOfABinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(7);
//        root.right.left = new TreeNode(9);

        System.out.println(diameter(root));
    }

    static int diameterRecur(TreeNode root, int[] res) {

        // Base case: tree is empty
        if (root == null)
            return 0;

        // find the height of left and right subtree
        // (it will also find of diameter for left
        // and right subtree).
        int lHeight = diameterRecur(root.left, res);
        int rHeight = diameterRecur(root.right, res);

        // Check if diameter of root is greater
        // than res.
        res[0] = Math.max(res[0], lHeight + rHeight);

        // return the height of current subtree.
        return 1 + Math.max(lHeight, rHeight);
    }

    // Function to get diameter of a binary tree
    static int diameter(TreeNode root) {
        int[] res = new int[1];
        diameterRecur(root, res);
        return res[0];
    }
}
