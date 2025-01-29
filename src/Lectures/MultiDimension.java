package Lectures;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.toString(arr));
//        for(int[] j:arr){
//            System.out.println(Arrays.toString(j));
//        }


    }
}
