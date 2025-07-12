package leetcode;

import java.util.Arrays;

public class Ques1365 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] result = new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            int count = 0;
//            for(int j=0;j<nums.length;j++){
//                if(nums[j]<nums[i]&&j!=i) {
//                    count++;
//                }
//            }
//            result[i] = count;
//        }
//        return result;
        int[] smaller = new int[101];

        for (int i = 0; i < nums.length; i++)
        {
            smaller [nums[i]]++;
        }
        for (int i = 1; i < 101; i++)
        {
            smaller[i] += smaller [i-1];
        }
        for (int i = 0; i < nums.length; i++)
        {
            int position = nums[i];
            if (position == 0) nums[i] = 0;
            else
            {
                nums[i] = smaller[position-1];
            }
        }
        return nums;

    }
}
