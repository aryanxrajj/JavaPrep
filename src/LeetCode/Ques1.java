package leetcode;

import java.util.Arrays;

public class Ques1 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(Arrays.toString(twoSum(nums,6)));
    }

    static int[] twoSum(int[] nums, int target) {
       for(int i =0;i<nums.length-1;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]+nums[j]==target){
                   return new int[]{i,j};
               }
           }
       }
       return new int[] {-1,-1};
    }
}
