package LeetCode;

import java.util.Arrays;

public class Ques41 {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(Arrays.toString(firstMissingPositive(nums)));
    }

    static int findsmallest(int[] nums){
        int small = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<small){
                small = nums[i];
            }
        }
        if (small < 0) {
            return -(small);
        }
        return small;
    }

    static int[] firstMissingPositive(int[] nums) {
        int small = findsmallest(nums);
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-small;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        return nums;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
