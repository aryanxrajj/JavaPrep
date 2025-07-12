package LeetCode;

public class Ques100 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);

        System.out.println(isSameTree(root,root2));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null || p.val != q.val){
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
