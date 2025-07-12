package leetcode;

import java.util.Arrays;

public class Ques238 {
    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            result[i] = product(nums,i);
        }

        return result;
    }

    public static int product(int[] nums, int j) {
        int product = 1;
        for(int i  = 0;i< nums.length;i++){
            if(i!=j){
                product*=nums[i];
            }
        }
        return product;
    }

}
