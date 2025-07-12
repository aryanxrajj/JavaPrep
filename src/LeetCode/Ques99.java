package LeetCode;

public class Ques99 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        preorder(root);
        System.out.println();
        recoverTree(root);
        preorder(root);

    }

    public static void preorder(TreeNode root){
        if(root  == null){
            return;
        }

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    //Approach that fails bcz it only checks the Adjacent Element
    public static void recoverTree2(TreeNode root) {
        if(root == null){
            return;
        }

        if(root.left != null && root.left.val > root.val){
            int temp = root.val;
            root.val = root.left.val;
            root.left.val = temp;
            return;
        }

        if(root.right != null && root.right.val < root.val){
            int temp = root.val;
            root.val = root.right.val;
            root.right.val = temp;
            return;
        }

        recoverTree2(root.left);
        recoverTree2(root.right);
    }

    //We know that inorder traversal gives the sorted order of Binary Search Tree
    //So We Compare each node through it previous element

    static TreeNode FirstNode = null;
    static TreeNode SecondNode = null;
    static TreeNode PrevElement = new TreeNode(Integer.MIN_VALUE);

    public static void recoverTree(TreeNode root){
        traverseinorder(root);
        int temp = FirstNode.val;
        FirstNode.val = SecondNode.val;
        SecondNode.val = temp;
    }

    public static void traverseinorder(TreeNode root){
        if(root == null){
            return;
        }

        traverseinorder(root.left);

        if(FirstNode == null && PrevElement.val > root.val){
            FirstNode = PrevElement;
        }

        if(FirstNode != null && PrevElement.val > root.val){
            SecondNode = root;
        }

        PrevElement = root;

        traverseinorder(root.right);
    }
}
