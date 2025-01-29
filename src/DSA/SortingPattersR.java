package DSA;

import Revision.SelectionSort;

import java.util.Arrays;

public class SortingPattersR {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        SelectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
//        pattern(4,0);
    }
    //Pattern printing through recursion...
    public static void pattern(int r, int c){
        if(r == 0){
            return;
        }
        if(c<r){
            pattern(r,c+1);
            System.out.print("*");

        }else{
            pattern(r-1,0);
            System.out.println();
        }
    }
    //Bubble Sort through Recursion...
    public static void BubbleSort(int[] arr, int r, int c){
        if(r == 0){
            return;
        }

        if(c < r){
            if(arr[c] > arr[c+1]){
                swap(arr,c,c+1);
                BubbleSort(arr,r,c+1);
            }
        }else{
            BubbleSort(arr,r-1,0);
        }
    }
    //Selection Through Recursion.
    public static void SelectionSort(int[] arr, int r, int c,int max){
        if(r == 0){
            return;
        }

        if(c<r){
            if(arr[c]>arr[max]){
                SelectionSort(arr,r,c+1,c);
            }else{
                SelectionSort(arr,r,c+1,max);
            }
        }else{
            swap(arr,r-1,max);
            SelectionSort(arr,r-1,0,0);
        }
    }
    //Swap Function
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
