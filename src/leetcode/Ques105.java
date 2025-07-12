package leetcode;

public class Ques105 {
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7,6};
        int[] inorder = {9,3,15,20,6,7};

        TreeNode ans = buildTree(preorder,inorder);
        inorder(ans);
    }

    private static void inorder(TreeNode ans) {
        if(ans == null){
            return;
        }

        inorder(ans.left);
        System.out.print(ans.val + " ");
        inorder(ans.right);
    }

    //Wrong Approach Solve it Later
    public static TreeNode buildTree(int[] preorder, int[] inorder){
        TreeNode root = new TreeNode(preorder[0]);

        TreeNode temp = root;
        if(preorder.length % 2 == 0){
            for (int i = 1; i < preorder.length - 1; i += 2) {
                temp.left = new TreeNode(preorder[i]);
                temp.right = new TreeNode(preorder[i + 1]);
                temp = temp.right;
            }
            temp.left = new TreeNode(preorder[preorder.length - 1]);
        }else {
            for (int i = 1; i < preorder.length; i += 2) {
                temp.left = new TreeNode(preorder[i]);
                temp.right = new TreeNode(preorder[i + 1]);
                temp = temp.right;
            }
        }

        return root;
    }
}
