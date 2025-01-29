package Misty;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // declaration
        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[5];
        // printing
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        // input
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }

        for(int i: arr){
            System.out.print(i+" ");
        }



    }
}
