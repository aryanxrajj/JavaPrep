package CodeChef;

import java.util.Scanner;

public class MIN_TO_MAX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int min_value = 0;
            for(int i =0;i<n;i++){
                if(a[i] < a[min_value]){
                    min_value = i;
                }
            }

            System.out.println(min_value);
            int no_of_operations = 0;
            for(int i=0;i<n;i++){
                if(a[i] != a[min_value] &&  i != min_value){
                    no_of_operations++;
                }
            }

            System.out.println(no_of_operations);
        }
    }

}
