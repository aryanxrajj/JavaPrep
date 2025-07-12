package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Ques2099 {
    public static void main(String[] args) {
        int[] nums = {2,1,3,3};
        int k = 2;
        System.out.println(Arrays.toString(maxSubsequence(nums,k)));

        int[] nums2 = {-1,-2,3,4};
        int k2 = 3;
        System.out.println(Arrays.toString(maxSubsequence(nums2,k2)));

        int[] nums3 = {3,4,3,3};
        int k3 = 2;
        System.out.println(Arrays.toString(maxSubsequence(nums3,k3)));
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            queue.add(num);
        }

        int[] arr = new int[k];
        for(int i = 0; i < k; i++){
            arr[i] = queue.poll();
        }

        return arr;
    }
}
