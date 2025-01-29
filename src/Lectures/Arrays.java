package Lectures;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int[] roll = {1,3,4,5,6};
        String[] st = new String[5];
        System.out.println(roll[4]);
        System.out.println(arr[0]);
        System.out.println(st[2]);

        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        for(int j: arr){
            System.out.print(j + " ");
        }

        int a = input.nextInt();
    }
}
