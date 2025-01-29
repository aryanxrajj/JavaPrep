package Assignment.leetcode;

import java.util.Arrays;

public class Ques1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums,3)));
    }

    static int[] shuffle(int[] nums, int n) {

        int[] arr = new int[2*n];

        for(int i=0; i<n; i++){
            arr[2 * i] = nums[i];         // Place xi at even indices
            arr[2 * i + 1] = nums[i + n]; // Place yi at odd indices
        }
        return arr;
    }
}
