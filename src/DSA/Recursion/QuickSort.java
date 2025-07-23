package DSA.Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        quick(nums,0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }

    public static void quick(int[] nums,int low, int high){
        if(high <= low){
            return;
        }

        int start = low,end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        while(start <= end){
            while(nums[start] < pivot){
                start++;
            }
            while(nums[end] > pivot){
                end--;
            }

            if(start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        quick(nums,low,end);
        quick(nums,start,high);
    }
}
