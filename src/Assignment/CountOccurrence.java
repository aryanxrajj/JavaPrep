package Assignment;

import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int count;
        for(count = 0; n != 0; n /= 10) {
            int rem = n % 10;
            if (rem == 7) {
                ++count;
            }
        }

        System.out.println(count);
    }
}
