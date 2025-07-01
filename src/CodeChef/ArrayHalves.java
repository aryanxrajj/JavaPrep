package CodeChef;

import java.util.Scanner;

public class ArrayHalves {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();
        while(tc-- > 0){
            int n = input.nextInt();
            int[] arr = new int[2*n];
            int count = 0, ans = 0;
            for(int i = 0; i < 2 * n;i++){
                arr[i] = input.nextInt();
            }

            for(int i : arr){
                if(i > n){
                    count++;
                }else{
                    ans+=count;
                }
            }

            System.out.println(ans);
        }
    }
}
