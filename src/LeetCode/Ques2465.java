package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ques2465 {
    public static void main(String[] args) {
        int[] nums = {4,1,4,0,3,5};
        System.out.println(distinctAverages(nums));

        int[] nums2 = {1,100};
        System.out.println(distinctAverages(nums2));
    }

    public static int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int start = 0, end = nums.length - 1;
        Set<Double> set = new HashSet<>();

        while(start < end){
            double average = (double)(nums[start]+nums[end])/2;
            set.add(average);
            start++;
            end--;
        }

        return set.size();
    }
}
