package leetcode;

import java.util.Arrays;

public class Ques1331 {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));

    }

    static int[] arrayRankTransform(int[] arr) {
        for(int i = 0;i<arr.length;i++){
            int last = arr.length-i-1;
            int findmax = max(arr,last);
            swap(arr,last,findmax);
        }
        return arr;

    }

    static void swap(int[] arr, int last, int findmax) {
        int temp = arr[last];
        arr[last] = arr[findmax];
        arr[findmax] = temp;
    }

    static int max(int[] arr, int last) {
        int max = 0;
        for(int i=0;i<=last;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}
