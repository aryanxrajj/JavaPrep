package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        BubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleSort(int[] arr, int pass, int swap){
        if(pass == 0){
            return;
        }

        if(swap < pass){
            if(arr[swap] > arr[swap+1]){
                int temp = arr[swap];
                arr[swap] = arr[swap+1];
                arr[swap+1] = temp;
                BubbleSort(arr,pass,swap+1);
            }
        }else{
            BubbleSort(arr,pass-1,0);
        }
    }
}
