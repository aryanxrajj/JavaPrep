package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Ques2032 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,3,2,};
        int[] nums2 = {2,3};
        int[] nums3 = {3};
        System.out.println(twoOutOfThree(nums1,nums2,nums3));
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> result = new ArrayList<>();
        int[] n1 = new int[101];
        int[] n2 = new int[101];
        int[] n3 = new int[101];

        for (int i = 0; i < nums1.length; i++) {
            n1[nums1[i]]++;
        }

        for (int i = 0; i < nums2.length; i++) {
            n2[nums2[i]]++;
        }

        for (int i = 0; i < nums3.length; i++) {
            n3[nums3[i]]++;
        }

        for (int i = 0; i < n1.length; i++) {
            if ((n1[i] >= 1 && n2[i] >= 1) || (n2[i] >= 1 && n3[i] >= 1) || (n1[i] >= 1 && n3[i] >= 1)) {
                result.add(i);
            }
        }

        return result;

    }
}
