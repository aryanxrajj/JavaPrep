package LeetCode;

import java.util.Arrays;

public class Ques34 {
    public static void main(String[] args) {
       int[] arr = {5,7,7,7,7,8,8,10};
        System.out.println(Arrays.toString(misty(arr,8)));
    }

    static int[] misty(int[] nums,int target){
        int[] result = new int[2];
        result[0] = searchRange(nums,target,true);
        result[1] = searchRange(nums,target,false);
        return result;
    }
    static int searchRange(int[] nums, int target,boolean find) {
        int start = 0;
        int end = nums.length-1;
        int fo=-1;

        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<nums[mid]){
              end = mid-1;
            }else if(target>nums[mid]){
                start = mid+1;
            }else{
                if(find) {
                    end = mid - 1;
                    fo = mid;
                }else{
                    start = mid+1;
                    fo = mid;
                }
            }

        }
        return fo;
    }
}
