package DSA.Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        Selection(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));

    }

    public static void Selection(int[] arr,int pass, int swap, int max){
        if(pass == 0){
            return;
        }

        if(swap < pass){
            if(arr[swap] > arr[max]){
                max = swap;
            }
            int temp = arr[pass];
            arr[pass] = arr[max];
            arr[max] = temp;
            Selection(arr,pass,swap+1,max);
        }else{
            Selection(arr,pass-1,0,0);
        }
    }
}
