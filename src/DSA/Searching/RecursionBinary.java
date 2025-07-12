package DSA.Searching;

public class RecursionBinary {
    public static void main(String[] args) {
        int[] nums = {1,5,6,7,8,23,46};
        System.out.println(binary(nums,23,0,nums.length-1));

    }

    static int binary(int[] nums,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(target==nums[mid]){
            return mid;
        }
        if(target<nums[mid]){
            return binary(nums,target,s,mid-1);
        }
        return binary(nums,target,mid+1,e);
    }
}
