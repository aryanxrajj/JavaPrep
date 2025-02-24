package CodeChef;

import java.util.Scanner;

public class BearandCandies123 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test_cases = input.nextInt();

        while(test_cases-- > 0){
            int limak = input.nextInt();
            int bob = input.nextInt();
            int turn  = 1;
            while (true) {
                if (turn % 2 == 1) {  // Limak's turn (odd turns)
                    if (limak < turn) {
                        System.out.println("Bob");  // Limak can't eat, Bob wins
                        break;
                    }
                    limak -= turn;
                } else {  // Bob's turn (even turns)
                    if ( bob< turn) {
                        System.out.println("Limak");  // Bob can't eat, Limak wins
                        break;
                    }
                    bob -= turn;
                }
                turn++;  // Next turn
            }
        }

    }
}
