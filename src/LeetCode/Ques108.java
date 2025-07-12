package LeetCode;

public class Ques108 {
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(nums);
        preOrder(root);
    }

    public static void preOrder(TreeNode root){
        if(root == null){
            return;
        }

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return buildBst(nums,0,nums.length );
    }

    private static TreeNode buildBst(int[] nums, int start, int end) {
        if(start == end){
            return null;
        }

        int mid = (start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBst(nums,start,mid);
        root.right = buildBst(nums,mid+1,end);
        return root;
    }


}

