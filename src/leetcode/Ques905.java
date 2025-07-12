package leetcode;

import java.util.Arrays;

public class Ques905 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));

    }

    static int[] sortArrayByParity(int[] nums) {
       int start = 0;
       int end = nums.length-1;
       while(start<end) {
           if (nums[end]%2==0) {
               swap(nums, start, end);
               start++;
           }else{
               end--;
           }
       }
       return nums;
    }

    static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
