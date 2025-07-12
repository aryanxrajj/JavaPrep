package LeetCode;

import java.util.Arrays;

public class Ques1480 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(sum(arr)));
    }

    static int[] sum(int[] nums){
        int sum =nums[0];
        int j = 0;
        for(int i=1;i<nums.length;i++){
            nums[i]= nums[j]+nums[i];
            j++;
        }
        return nums;
    }
}
