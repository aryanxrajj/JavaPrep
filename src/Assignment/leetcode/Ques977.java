package Assignment.leetcode;

import java.util.Arrays;

public class Ques977 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    static int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]*=nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            int last = nums.length-i-1;
            int findmax = max(nums,last);
            swap(nums,last,findmax);
        }
        return nums;

    }

    static void swap(int[] arr, int last, int findmax) {
        int temp = arr[last];
        arr[last] = arr[findmax];
        arr[findmax] = temp;
    }

    static int max(int[] arr, int last) {
        int max = 0;
        for(int i=0;i<=last;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}
