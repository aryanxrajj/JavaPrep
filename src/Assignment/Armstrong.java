package Assignment;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int check = n;

        int sum;
        for(sum = 0; n != 0; n /= 10) {
            int rem = n % 10;
            sum += rem * rem * rem;
        }

        if (sum == check) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

    }
}
