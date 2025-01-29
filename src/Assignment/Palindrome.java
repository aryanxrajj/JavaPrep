package Assignment;

import java.util.Scanner;

public class Palindrome {
    public Palindrome() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rev = 0;

        int check;
        for(check = n; n != 0; n /= 10) {
            int rem = n % 10;
            rev = rev * 10 + rem;
        }

        if (rev == check) {
            System.out.println("Pailndrome");
        } else {
            System.out.println("Not palindrome");
        }

    }
}
