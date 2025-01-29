package Misty;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] nums = {2,56,78,88,91,99};
        System.out.println(recursion(nums,88,0,nums.length-1));

    }

    static int recursion(int[] nums,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid = s +(e-s)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(target>nums[mid]){
            return recursion(nums,target,mid+1,e);
        }
        return recursion(nums,target,s,mid-1);

    }
}
