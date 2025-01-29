package Lectures;

import java.util.Scanner;

public class PassingFunctiontoArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i=0;i<nums.length;i++){
            nums[i] = input.nextInt();
        }
        change(nums);
        for(int j: nums){
            System.out.println(j+" ");
        }
    }

    static void change(int[] arr){
        arr[1] = 14;
    }

}
