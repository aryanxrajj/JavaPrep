package DSA;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {4,5,3,2,1};
        Cyclic(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void Cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swapnum(arr,i,correct);
            }else{
                i++;
            }
        }
    }

    static void swapnum(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
