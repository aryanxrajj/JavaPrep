package Recursion.Level1Ques;

import java.util.Arrays;

public class Ques4 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        SumOfTriangle(nums);
    }

    public static void SumOfTriangle(int[] nums){
        if(nums.length < 1){
            return;
        }

        int[] temp = new int[nums.length - 1];
        for(int i = 0; i < temp.length; i++){
            temp[i] = nums[i] + nums[i+1];
        }

        SumOfTriangle(temp);

        System.out.println(Arrays.toString(nums));
    }
}
