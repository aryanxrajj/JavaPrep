package Revision;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {45,67,98,76,34,56,10};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionsort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int last = arr.length-i-1;
            int max = findmax(arr,last);
            swap(arr,last,max);
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int findmax(int[] arr, int last) {
        int max = 0;
        for(int i=0;i<=last;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}
