package Assignment;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float principal = input.nextFloat();
        float rate = input.nextFloat();
        float time = input.nextFloat();
        float SI = principal * rate * time / 100.0F;
        System.out.println(SI);
    }
}
