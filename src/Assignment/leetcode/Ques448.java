package Assignment.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques448 {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(Arrays.toString(new List[]{findDisappearedNumbers(nums)}));

    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<Integer>();
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != (nums[correct])) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        int count =0 ;
        for(int j=0;j< nums.length;j++){
            if(nums[j]!=j+1){
                missing.add(j+1);
                count++;
            }
        }
        if(count==0){
            return missing;
        }else{
            return missing;
        }

    }

    static void swap(int[] nums,int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}
