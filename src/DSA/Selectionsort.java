package DSA;

import java.util.Arrays;
public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {98,849,684,946,12};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min_index = i;
            for(int  j =i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            swap(arr,i,min_index);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
