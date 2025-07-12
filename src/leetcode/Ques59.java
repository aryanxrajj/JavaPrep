package leetcode;

import java.util.Arrays;

public class Ques59 {
    public static void main(String[] args) {
        int n = 3;
        int[][] arr = matrix(n);
        for (int[] j : arr) {
            System.out.println(Arrays.toString(j));
        }
    }

    static int[][] matrix(int n) {
        int[][] arr = new int[n][n];
        int m = arr.length;
        int n1 = arr[0].length;
        int rb = 0, re = m - 1;
        int cb = 0, ce = n1 - 1;
        int count = 1;
        while (rb <= re && cb <= ce) {
            if (rb <= re & cb <= ce) {
                for (int i = cb; i <= ce; i++) {
                    arr[rb][i] = count;
                    count++;
                }
            }
            rb++;
            if (rb <= re & cb <= ce) {
                for (int i = rb; i <= re; i++) {
                    arr[i][ce] = count;
                    count++;
                }
            }
            ce--;
            if (rb <= re & cb <= ce) {
                for (int i = ce; i >= cb; i--) {
                    arr[re][i] = count;
                    count++;
                }
            }
                re--;
            if (rb <= re & cb <= ce) {
                for (int i = re; i >= rb; i--) {
                    arr[i][cb] = count;
                    count++;
                }
                cb++;

            }
        }
        return arr;
    }
}
