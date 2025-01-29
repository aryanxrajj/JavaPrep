package Assignment.leetcode;

import java.util.Arrays;
public class Ques4 {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println((findMedianSortedArrays(nums1,nums2)));

    }

    static double findMedianSortedArrays(int[] nums1,int[] nums2){
        int[] nums3 = new int[nums1.length+nums2.length];
        for(int i=0;i< nums1.length;i++){
            nums3[i] = nums1[i];
        }
        for(int i=0;i< nums2.length;i++){
            nums3[i+ nums1.length] = nums2[i];
        }
        for(int i=0;i<nums3.length;i++){
            int last = nums3.length-i-1;
            int findmax = max(nums3,last);
            swap(nums3,last,findmax);
        }
        if(nums3.length%2==1){
            int start = 0,end = nums3.length-1;
            int mid = start + (end-start)/2;
            return nums3[mid];
        }
        int start = 0,end = nums3.length-1;
        int mid = start + (end-start)/2;
        return (double) (nums3[mid]+nums3[mid+1])/2;
    }

    static void swap(int[] nums3, int last, int findmax) {
        int temp = nums3[last];
        nums3[last] = nums3[findmax];
        nums3[findmax] = temp;
    }

    static int max(int[] nums3, int last) {
        int max = 0 ;
        for(int i=0;i<=last;i++){
            if(nums3[i]>nums3[max]){
                max = i;
            }
        }
        return max;
    }
}
