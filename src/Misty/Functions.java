package Misty;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int a = 10;
//        int b = 20;
//       swap(a,b);
//        System.out.println(a);
//        System.out.println(b);
        int[] arr = {1,3,4,6,8};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] arr){
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a);
//        System.out.println(b);
        arr[1] = 14;
    }
}
