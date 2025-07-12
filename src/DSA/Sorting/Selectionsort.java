package DSA.Sorting;

import java.util.Arrays;
public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {98,849,684,946,12};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            //find the maximum element and put it at the correct index;
            int last = arr.length-i-1;
            int findmax =  max(arr,last);
            swap(arr,findmax,last);
        }
    }

    static void swap(int[] arr, int findmax, int last) {
        int temp = arr[findmax];
        arr[findmax] = arr[last];
        arr[last] = temp;
    }

    static int max(int[] arr, int last) {
        int max_element = 0;
        for(int i = 0;i<=last;i++){
            if(arr[i] > arr[max_element]){
                max_element = i;
            }
        }
        return max_element;
    }
}
