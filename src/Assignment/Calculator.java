package Assignment;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        char ch;
        do {
            System.out.print("Enter first Number: ");
            num1 = input.nextInt();
            System.out.print("Enter a Second Number: ");
            num2 = input.nextInt();
            System.out.print("Enter the operator: ");
            ch = input.next().trim().charAt(0);
        } while(ch != '+' && ch != '-' && ch != '/' && ch != '*' && ch != '%' && ch != 'x' && ch != 'X');

        if (ch == '+') {
            System.out.println(num1 + num2);
        }

        if (ch == '-') {
            System.out.println(num1 - num2);
        }

        if (ch == '*') {
            System.out.println(num1 * num2);
        }

        if (ch == '/') {
            if (num1 == 0 || num2 == 0) {
                System.out.println("Cannot Divide By Zero");
            }

            System.out.println(num1 / num2);
        }

        if (ch == '%') {
            System.out.println(num1 % num2);
        }

        if (ch == 'x' || ch == 'X') {
            System.out.println("Thank you For Using");
        }

    }
}
