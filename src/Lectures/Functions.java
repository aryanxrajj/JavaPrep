package Lectures;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 3, 5, 5};
        array(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = num1 + num2;
        System.out.println(result);
    }

    static void swap(int n, int m) {
        int temp = n;
        n = m;
        m = temp;
        System.out.println(n);
        System.out.println(m);
    }

    static void array(int[] nums) {
        nums[0] = 99;
    }
}
