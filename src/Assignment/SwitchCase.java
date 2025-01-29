package Assignment;
import java.util.Scanner;
public class SwitchCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Month you want to print: ");
        switch (input.next()) {
            case "1":
                System.out.println("January");
                break;
            case "2":
                System.out.println("February");
                break;
            case "3":
                System.out.println("March");
                break;
            case "4":
                System.out.println("April");
                break;
            case "5":
                System.out.println("May");
                break;
            case "6":
                System.out.println("June");
                break;
            case "7":
                System.out.println("July");
                break;
            case "8":
                System.out.println("August");
            case "9":
                System.out.println("September");
            case "10":
                System.out.println("October");
            case "11":
                System.out.println("November");
            case "12":
                System.out.println("December");
            default:
                System.out.println("Enter a valid number");
        }

    }
}
