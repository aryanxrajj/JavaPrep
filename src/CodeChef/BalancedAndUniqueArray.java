package CodeChef;

import java.util.ArrayList;
import java.util.Scanner;

public class BalancedAndUniqueArray {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int k = 0; k < test; k++) {
            int num = sc.nextInt();

            if (num % 4 != 0) {
                System.out.println("No");
                continue;
            }

            System.out.println("YES");

            int prin = 1;
            for (int i = 0; i < num / 4; i++) {
                System.out.print(prin + " ");
                prin += 2;
            }


            prin++;
            for (int i = 0; i < num / 4; i++) {
                System.out.print(prin + " ");
                prin += 2;
            }

            System.out.println();

            prin = 2;
            for (int i = 0; i < num / 4; i++) {
                System.out.print(prin + " ");
                prin += 2;
            }

            prin--;
            for (int i = 0; i < num / 4; i++) {
                System.out.print(prin + " ");
                prin += 2;
            }

        }
        sc.close();

    }
}
