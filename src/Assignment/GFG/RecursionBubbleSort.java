package Assignment.GFG;

import java.util.Arrays;

public class RecursionBubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr,int n) {
        if(n == 1){
            return;
        }
    }
}
