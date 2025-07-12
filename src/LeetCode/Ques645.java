package LeetCode;

import java.util.Arrays;

public class Ques645 {
    public static void main(String[] args) {
        int[] nums = {2,2};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int j =0;j<nums.length;j++){
            if (nums[j] != j + 1) {
                return new int[]{nums[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }


}
