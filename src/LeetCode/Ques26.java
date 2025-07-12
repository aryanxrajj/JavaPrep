package leetcode;

import java.util.LinkedHashSet;

public class Ques26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> map = new LinkedHashSet<>();
        int i = 0;
        for(int j = 0 ; j < nums.length ; j++){
            if(map.add(nums[j])){
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}
