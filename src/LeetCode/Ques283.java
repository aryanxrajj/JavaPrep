package LeetCode;
import java.util.Arrays;

public class Ques283 {
    public static void main(String[] args) {
        int[] nums = {1,0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums){
        if(nums.length == 1){
            return;
        }

        int left = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i]!= 0){
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
            }
        }
    }
}
