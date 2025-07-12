package LeetCode;

public class Ques1464 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        System.out.println(maxProduct(nums));

    }

    static int maxProduct(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int last = nums.length-i-1;
            int findmax = max(nums,last);
            swap(nums,last,findmax);
        }
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }

    static void swap(int[] nums, int last, int findmax) {
        int temp = nums[last];
        nums[last] = nums[findmax];
        nums[findmax] = temp;
    }

    static int max(int[] nums, int last) {
        int max = 0;
        for(int i=0;i<=last;i++){
            if(nums[i]>nums[max]){
                max = i;
            }
        }
        return max;
    }
}
