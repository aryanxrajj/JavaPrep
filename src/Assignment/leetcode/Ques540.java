package Assignment.leetcode;

import java.util.Arrays;

public class Ques540 {
    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }

    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(mid%2==1){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                start = mid+2;
            }else{
                end = mid;
            }
        }
        return nums[end];
    }
}
