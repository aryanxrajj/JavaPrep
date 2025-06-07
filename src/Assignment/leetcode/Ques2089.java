package Assignment.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques2089 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,3};
        int target = 2;
        System.out.println(targetIndices(arr,target));

        int[] arr2 = {1,2,5,2,3};
        int target2 = 3;
        System.out.println(targetIndices(arr2,target2));

        int[] arr3 = {1,2,5,2,3};
        int target3 = 5;
        System.out.println(targetIndices(arr3,target3));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                result.add(i);
            }
        }

        return result;
    }
}
