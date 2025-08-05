package DSA.Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {50,25,38,45,47,2};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                merged[k++] = left[i++];
            }else{
                merged[k++] = right[j++];
            }
        }

        while(i < left.length){
            merged[k++] = left[i++];
        }

        while(j < right.length){
            merged[k++] = right[j++];
        }

        return merged;
    }
}
