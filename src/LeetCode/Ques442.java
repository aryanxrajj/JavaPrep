package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques442 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(new List[]{findDuplicate(nums)}));

    }

    static List<Integer> findDuplicate(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while(i< nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!=j+1){
                result.add(nums[j]);
            }
        }
        return result;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
