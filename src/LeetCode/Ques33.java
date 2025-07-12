package LeetCode;

public class Ques33 {
    public static void main(String[] args) {
        int[] nums = {4,5,5,6,2};
        System.out.println(search(nums,6));

    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(nums[mid]>nums[mid+1]){
                end = mid-1;
            }else{
                start = mid;
            }
        }
        return -1;
    }
}
