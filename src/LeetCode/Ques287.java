package LeetCode;

public class Ques287 {
    public static void main(String[] args) {
        int[] nums = {4,3,1,4,2};
        System.out.println(findDuplicate(nums));

    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while(i< nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        return nums[nums.length-1];
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
