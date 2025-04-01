package Assignment.leetcode;

import java.util.Arrays;

public class Ques66 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(plusOne(arr)));

        int[] nums = {4,3,2,1};
        System.out.println(Arrays.toString(plusOne(nums)));

        int[] digits = {9};
        System.out.println(Arrays.toString(plusOne(digits)));

    }

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1 ; i >= 0 ; i--){
            if(digits[i] < 9){
                digits[i]+=1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }
}
