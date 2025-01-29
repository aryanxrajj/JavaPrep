package Revision;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {45,67,98,76,34,56,10};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionsort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    }

    public static void swap(int[] arr, int i, int min) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}
