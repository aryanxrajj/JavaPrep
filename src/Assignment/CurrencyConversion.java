package Assignment;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Amount in rupees: ");
        float rupee = input.nextFloat();
        System.out.printf("Total Amount in USD: %.2f", (double)rupee / 83.54);
    }
}
