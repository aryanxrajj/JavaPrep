package CodeChef;

import java.util.ArrayList;
import java.util.Scanner;

public class BalancedAndUniqueArray {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        int test_cases = input.nextInt();

        while(test_cases-- > 0){
            int n = input.nextInt();
            int[] arr = new int[n];
            ArrayList<Integer> arr2 = new ArrayList<>();
            ArrayList<Integer> arr3 = new ArrayList<>();
            int sum1 = 0;
            int sum2 = 0;

            if(n==2 || n==0 || n%2!=0){
                System.out.println("NO");
            }else{
                for(int i = 0;i < arr.length;i++){
                    arr[i] = i+1;
                }

                for(int i = 0; i < n/2;i++){
                    if(i%2==0){
                        sum1+=arr[i];
                        arr2.add(arr[i]);
                    }else{
                        sum2+=arr[i];
                        arr3.add(arr[i]);
                    }
                }

                for(int i = n/2; i < arr.length;i++){
                    if(i%2==0){
                        sum2+=arr[i];
                        arr3.add(arr[i]);
                    }else{
                        sum1+=arr[i];
                        arr2.add(arr[i]);
                    }
                }

                if(sum1 == sum2){
                    System.out.println("YES");
                    for(int i = 0;i < arr2.size();i++){
                        System.out.print(arr2.get(i));
                    }
                    System.out.println();
                    for(int i = 0;i < arr3.size();i++){
                        System.out.print(arr3.get(i));
                    }

                }else{
                    System.out.println("NO");
                }

            }
        }

    }
}
