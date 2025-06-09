package Assignment.leetcode;

public class Ques2154 {
    public static void main(String[] args) {
        int[] nums = {161,28,640,264,81,561,320,2,61,244,183,108,773,61,976,122,988,2,370,392,488,375,349,432,713,563};
        int original = 61;
        System.out.println(findFinalValue(nums,original));
    }

    public static int findFinalValue(int[] nums, int original) {
        int[] freq = new int[1001];
        for (int num : nums) {
            freq[num]++;
        }

        if(original > 1000){
            return original;
        }

        if(freq[original] == 0){
            return original;
        }

        return findFinalValue(nums,original*2);
    }
}
