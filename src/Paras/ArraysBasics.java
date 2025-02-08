package Paras;

import java.util.Arrays;

public class ArraysBasics {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int[] arr1 = new int[5];
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
    }
}
