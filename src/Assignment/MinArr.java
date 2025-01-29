package Assignment;

import java.util.Scanner;

public class MinArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println(minarr(arr));

    }
    static int minarr(int[] arr){
        int min_arr = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min_arr){
                min_arr = arr[i];
            }
        }
        return min_arr;
    }
}
