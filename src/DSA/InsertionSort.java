package DSA;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5,3,4,1,2};
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static int find(int[] nums,int last) {
        int max = 0 ;
        for(int i=0;i<=last;i++){
            if(nums[i]>nums[max]){
                max = i;
            }
        }
        return max;
    }

    static void selection(int[] nums){
        for(int i = 0;i<nums.length;i++){
            int last  = nums.length-i-1;
            int getmax = find(nums,last);
            swap(nums,getmax,last);
        }
    }

    private static void swap(int[] nums,int first, int last) {
        int temp = nums[first];
        nums[first]= nums[last];
        nums[last] = temp;
    }
}
