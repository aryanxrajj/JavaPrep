package LeetCode;

import java.util.Arrays;

public class Ques2149 {
    public static void main(String[] args) {
        int[] arr = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        int[] arr2 = {-1,1};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

    //Wrong Approach For Maintaining Relative Order Bcz Swap Breaks Relative Order..
    public static int[] rearrangeArray(int[] nums) {
        int positive = 0, negative = 1;

        while(positive < nums.length && negative < nums.length){

            while(positive < nums.length && nums[positive] > 0){
                positive+=2;
            }

            while(negative < nums.length && nums[negative] < 0){
                negative+=2;
            }

            if(positive < nums.length && negative < nums.length) {
                int temp = nums[positive];
                nums[positive] = nums[negative];
                nums[negative] = temp;
            }
        }
        return nums;
    }

    //Optimal Approach While Maintaing Relative Order.

}

