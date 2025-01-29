package Assignment;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        int fib3 = 0;

        for(int i = 2; i <= n; ++i) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }

        System.out.println(fib3);
    }
}
