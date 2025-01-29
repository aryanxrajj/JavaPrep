package Assignment;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = input.nextInt();
        int count = 0;

        for(int i = 1; i <= n; ++i) {
            count += i;
        }

        System.out.println("Sum of Numbers is: " + count);
    }
}