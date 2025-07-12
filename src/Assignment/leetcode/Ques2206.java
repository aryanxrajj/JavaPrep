package Assignment.leetcode;

public class Ques2206 {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2,2};
        System.out.println(divideArray(nums));

        int[] nums2 = {1,2,3,4};
        System.out.println(divideArray(nums2));
    }

    public static boolean divideArray(int[] nums) {
        int[] count = new int[501];

        for(int n : nums){
            count[n]++;
        }

        for(int i = 0; i < nums.length - 1; i++){
            if(count[nums[i]] % 2 != 0){
                return false;
            }
        }

        return true;
    }
}
