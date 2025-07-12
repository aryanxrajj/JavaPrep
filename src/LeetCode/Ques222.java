package LeetCode;

public class Ques222 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        System.out.println(countNodes(root));
    }

    static int ans = 0;
    public static int countNodes(TreeNode root) {
        if(root == null){
            return ans;
        }

        ans+=1;
        countNodes(root.left);
        countNodes(root.right);

        return ans;
    }

}
