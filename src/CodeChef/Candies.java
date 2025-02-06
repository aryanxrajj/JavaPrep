package CodeChef;

import java.util.Scanner;

public class Candies {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);

        int Test_Cases = input.nextInt();

        while(Test_Cases-- >0){
            int n = input.nextInt();
            int[] arr = new int[2*n];

            for(int i = 0;i<arr.length;i++){
                arr[i] = input.nextInt();
            }

            for(int i=0;i<arr.length;i++){
                int count = 1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
                if(i == arr.length-1 && count<2){
                    System.out.println("YES");
                    break;
                }else if(count>2){
                    System.out.println("NO");
                    break;
                }
            }
        }
    }
}
