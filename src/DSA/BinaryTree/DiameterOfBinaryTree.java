package DSA.BinaryTree;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(5);
        root.right = new TreeNode(18);
        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(10);

        System.out.println(diameter(root));
    }

    static int diameterRecur(TreeNode root, int[] res) {
        if (root == null)
            return 0;

        int lHeight = diameterRecur(root.left, res);
        int rHeight = diameterRecur(root.right, res);

        res[0] = Math.max(res[0], lHeight + rHeight);
        return Math.max(lHeight, rHeight) + 1;
    }

    static int diameter(TreeNode root) {
        int[] res = new int[1];
        diameterRecur(root, res);
        return res[0];
    }
}
