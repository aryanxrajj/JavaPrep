package Misty;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 4, 2, 1};
        sort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void sort(int[] nums){
        for(int i=0;i<nums.length;i++) {
            int last = nums.length - i - 1;
            int findmax = max(nums, last);
            swap(nums,findmax,last);
        }
    }

    static void swap(int[] nums,int findmax, int last) {
        int temp=nums[findmax];
        nums[findmax]=nums[last];
        nums[last]=temp;
    }

    static int max(int[] nums, int last) {
        int max=0;
        for(int i=0;i<=last;i++){
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        return max;
    }


}
