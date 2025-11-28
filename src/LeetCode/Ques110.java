package LeetCode;

import com.sun.source.tree.TreeVisitor;

public class Ques110 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        boolean res = isBalanced(root);
        System.out.println(res);
    }

    public static boolean isBalanced(TreeNode root) {
        return calculate(root) != -1;
    }

    public static int calculate(TreeNode root){
        if(root == null) return 0;

        int left = calculate(root.left);
        int right = calculate(root.right);

        if(left == -1 || right == -1 || Math.abs(left - right) > 1){
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}
