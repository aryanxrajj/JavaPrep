package CodeChef;

import java.util.Scanner;

public class StringGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test_cases = input.nextInt();

        while (test_cases-- > 0) {
            int n = input.nextInt();
            input.nextLine();
            String s = input.nextLine();

            boolean Zalatan = true;
            boolean Ramos = false;

            while (s.length() >= 2) {
                if (s.charAt(0) != s.charAt(1)) {
                    s = s.substring(2);
                    Zalatan = !Zalatan;
                    Ramos = !Ramos;
                }else{
                  s = s.substring(2);
                }

            }

            if (!Zalatan) {
                System.out.println("Zalatan");
            }

            if (!Ramos) {
                System.out.println("Ramos");
            }

        }
    }
}
