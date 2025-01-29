package Assignment.leetcode;

import java.util.Arrays;

public class Ques922 {
    public static void main(String[] args) {
        int[] nums= {2,3,1,1,4,0,0,4,3,3};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));

    }

    static int[] sortArrayByParityII(int[] nums) {
        int i = 0, j = 1, n = nums.length;
        while (i < n && j < n) {
            while (i < n && nums[i] % 2 == 0) {
                i += 2;
            }
            while (j < n && nums[j] % 2 == 1) {
                j += 2;
            }
            if (i < n && j < n) {
                swap(nums, i, j);
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
