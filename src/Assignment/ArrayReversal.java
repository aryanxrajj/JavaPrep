package Assignment;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int c =1;//degrading the last index
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i]= arr[arr.length-c];
            arr[arr.length-c] = temp;
            c++;
        }
        System.out.println(Arrays.toString(arr));
        for(int j:arr){
            System.out.print(j+" ");
        }
    }
}
