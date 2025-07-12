package LeetCode;
import java.util.Arrays;

public class Ques349 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));

        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums3,nums4)));


    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] count1 = new int[1001];
        int[] count2 = new int[1001];
        for(int i = 0; i < nums1.length; i++){
            count1[nums1[i]]++;
        }

        for(int i = 0; i < nums2.length; i++){
            count2[nums2[i]]++;
        }

        int[] result = new int[1001];
        int i = 0;
        for(int j = 0; j < count1.length; j++){
            if(count1[j] >= 1 && count2[j] >= 1){
                result[i++] = j;
            }
        }

        return Arrays.copyOfRange(result,0,i);
    }
}
