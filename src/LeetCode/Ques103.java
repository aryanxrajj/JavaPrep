package LeetCode;

import com.sun.source.tree.Tree;

import java.util.*;

public class Ques103 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> res = zigzagLevelOrder(root);
        for(List list : res){
            System.out.println(list);
        }
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean zigzag = false;

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                list.add(curr.val);

                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }

            if(zigzag){
                Collections.reverse(list);
            }

            result.add(list);
            zigzag = !zigzag;
        }

        return result;
    }
}
