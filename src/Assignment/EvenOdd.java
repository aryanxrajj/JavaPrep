package Assignment;
import java.util.Scanner;
public class EvenOdd {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
