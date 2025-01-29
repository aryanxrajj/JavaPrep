package Revision;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {45,67,98,76,34,56,10};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void BubbleSort(int[] arr){
        for(int i =0;i<arr.length;i++){
            boolean swap = false;
            for(int j =1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
