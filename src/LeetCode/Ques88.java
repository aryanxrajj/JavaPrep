package LeetCode;

import java.util.Arrays;

public class Ques88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));

    }

    static void merge(int[] nums1, int m, int[] nums2, int n){
        for(int i = 0;i<n;i++){
            nums1[m+i] = nums2[i];
        }
        for(int i=0;i<nums1.length;i++){
            int last = nums1.length-i-1;
            int findmax = getmax(nums1,last);
            swap(nums1,last,findmax);
        }
    }

    static void swap(int[] nums1, int last, int findmax) {
        int temp = nums1[last];
        nums1[last] = nums1[findmax];
        nums1[findmax] = temp;
    }

    static int getmax(int[] nums1, int last) {
        int max = 0;
        for(int i = 0;i<=last;i++){
            if(nums1[i]>nums1[max]){
                max = i;
            }
        }
        return max;
    }
}
