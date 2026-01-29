package LeetCode;

import java.util.Arrays;

public class Ques31 {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void nextPermutation(int[] nums) {
        int pivot = -1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot != -1) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[pivot]) {
                    int temp = nums[pivot];
                    nums[pivot] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
        }

        if(pivot == -1){
            reverse(nums,0, nums.length - 1);
        }

        if(pivot != -1){
            reverse(nums,pivot+1, nums.length - 1);
        }
    }

    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
