package DSA.Backtracking;

import java.util.*;

public class SubsetGenerator {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),result);
        return result;
    }

    private static void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        if(index == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        backtrack(index + 1,nums,current,result);

        current.remove(current.removeLast());
        backtrack(index + 1,nums,current,result);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> allSubsets = subsets(nums);
        for (List<Integer> subset : allSubsets) {
            System.out.println(subset);
        }
    }
}
