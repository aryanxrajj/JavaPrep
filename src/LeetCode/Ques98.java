package LeetCode;

public class Ques98 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(-1);
//        root.right = new TreeNode(3);
//        root.right.left = new TreeNode(3);
//        root.right.right = new TreeNode(6);

        System.out.println(isValidBST(root));
    }

    static TreeNode prevElement = null;
    static boolean validate = true;
    public static boolean isValidBST(TreeNode root) {
        if(root.left  == null && root.right == null){
            return true;
        }
        traverseinorder(root);
        return validate;
    }

    private static void traverseinorder(TreeNode root) {
        if(root == null){
            return;
        }

        traverseinorder(root.left);

        if(prevElement != null && prevElement.val >= root.val){
            validate = false;
        }

        prevElement = root;

        traverseinorder(root.right);
    }
}
