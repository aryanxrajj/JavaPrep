package Misty;

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
//        System.out.println(x);
        x = 50;
        System.out.println(x);
    }
}
