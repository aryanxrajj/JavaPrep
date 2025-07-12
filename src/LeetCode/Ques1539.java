package leetcode;

import java.util.Arrays;

public class Ques1539 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        System.out.println(Arrays.toString(findKthPositive(arr,5)));

    }

    static int[] findKthPositive(int[] arr, int k) {
        int n = arr[arr.length-1];
        int[] positive = new int[arr.length-1];
        int count = 1;
        for(int i =0;i<=n;i++){
            if(arr[i]!=count){
                arr[i] = count;
            }
            count++;
        }
        return arr;

    }
}
