package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ques230 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        System.out.println(kthSmallest2(root,3));
    }

    public static int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = getList(root,list);
        Collections.sort(ans);
        return ans.get(k-1);
    }

    //BruteForce Way
    private static List<Integer> getList(TreeNode root, List<Integer> list) {
        if(root == null){
            return list;
        }

        list.add(root.val);
        getList(root.left,list);
        getList(root.right,list);

        return list;
    }

    //Optimized way

    private static int count =0;
    private static int result = -1;

    public static int kthSmallest2(TreeNode root, int k){
        inorder(root,k);
        return result;
    }

    private static void inorder(TreeNode root, int k){
        if(root == null){
            return;
        }

        inorder(root.left,k);

        count++;
        if(count == k){
            result = root.val;
            return;
        }

        inorder(root.right,k);
    }
}
