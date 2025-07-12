package CodeChef;

import java.util.Scanner;

public class TraceOfMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test_cases = input.nextInt();

        while(test_cases-- > 0){
            int n = input.nextInt();
            int[][] arr = new int[n][n];

            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    arr[i][i] = input.nextInt();
                }
            }

            int sum = Integer.MIN_VALUE;
            for(int i = 0;i < n -1 ;i++){
                for(int j = 1;j <=1 ;j++){
                    sum = Math.max(arr[i][i] + arr[i+1][i+1] , sum);
                }
            }

            System.out.println(sum);
        }
    }
}
