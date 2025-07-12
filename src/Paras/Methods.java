package Paras;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        int temp = x;
        x = y;
        y = temp;
        System.out.println(x + "" + y);
    }

    public static int sum(int a, int b){
        return a +b ;
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b= temp;
    }

    public static void swap(int[]arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
