package LeetCode;

import java.util.Arrays;

public class Ques1929 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(concatenated(nums)));
    }

    static int[] concatenated(int[] nums){
        int[] a = nums;
        int[] b = nums;
        int al = nums.length;
        int bl = nums.length;
        int cl = al +bl;
        int[] c = new int [cl];
        for (int i = 0; i < al; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i <bl ; i++) {
            c[al+i] = b[i];

        }
        return c;
    }
}
