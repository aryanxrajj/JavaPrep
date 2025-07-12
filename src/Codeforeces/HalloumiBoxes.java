package Codeforeces;

import java.util.Arrays;
import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while(t-- > 0){
            int n = input.nextInt();
            int k = input.nextInt();

            long[] arr = new long[n];
            for(int i = 0;i < arr.length;i++){
                arr[i] = input.nextLong();
            }

            long[] arr2 = Arrays.copyOf(arr,arr.length);
            Arrays.sort(arr2);
            if(Arrays.equals(arr,arr2) || k > 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            input.close();
        }
    }
}
