package LeetCode;

import java.util.*;

public class Ques199 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right .right = new TreeNode(4);

        List<Integer> ans = rightSideView(root);
        System.out.println(ans);
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        result.add(root.val);

        while(!queue.isEmpty()){
            int size = queue.size();
            boolean found = true;
            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                if(curr.right != null) queue.add(curr.right);
                if(curr.left != null) queue.add(curr.left);

                if(curr.right != null && found){
                    result.add(curr.right.val);
                    found = false;
                }

                if(curr.left != null && found){
                    result.add(curr.left.val);
                    found = false;
                }
            }
        }

        return result;

    }
}
