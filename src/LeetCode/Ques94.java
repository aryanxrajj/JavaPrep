package LeetCode;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}

    TreeNode(int val){this.val = val;}

    TreeNode(int val, TreeNode left , TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Ques94 {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while(curr != null || !stack.isEmpty()){
            //Reach the left most Node of the Current Node.
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            //Current must be null at this point
            curr = stack.pop();
            list.add(curr.val);
            //Visit the right most subtree
            curr = curr.right;

        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("Inorder Traversal Example 1: " + inorderTraversal(root));

        // Example 2: root = [1,2,3,4,5,null,8,null,null,6,7,9]
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.left.right.left = new TreeNode(6);
        root2.left.right.right = new TreeNode(7);
        root2.right.right = new TreeNode(8);
        root2.right.right.left = new TreeNode(9);

        System.out.println("Inorder Traversal Example 2: " + inorderTraversal(root2));

        // Example 3: root = []
        TreeNode root3 = null;
        System.out.println("Inorder Traversal Example 3: " + inorderTraversal(root3));

        // Example 4: root = [1]
        TreeNode root4 = new TreeNode(1);
        System.out.println("Inorder Traversal Example 4: " + inorderTraversal(root4));
    }
}
