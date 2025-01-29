package DSA;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        Cyclic(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void Cyclic(int[] nums) {
       int i=0;
       while(i<nums.length){
           int correct = nums[i] -1;
           if(nums[i]!=(nums[correct])){
               swap(nums,i,correct);
           }else{
               i++;
           }
       }
//        for(int i=0;i<nums.length;i++){
//            int correct = nums[i]-1;
//            if(nums[i]!=nums[correct]){
//                swap(nums,i,correct);
//            }
//        }
    }

    static void swap(int[] nums,int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}
