package LeetCode;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Ques863 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode target = root.left;

        System.out.println(distanceK(root,target,2));
    }

    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();
        calculate(root,target,result,0,false, k);
        return result;
    }

    public static void calculate(TreeNode root,TreeNode target, List<Integer> list, int count, boolean found, int k){
        if(root == null) return;
        if(root == target) found = true;
        if(count == k) list.add(root.val);
        if (found == true) count = count + 1;
        calculate(root.left,target,list,count,found,k);
        calculate(root.right, target,list,count,found,k);
    }
}
