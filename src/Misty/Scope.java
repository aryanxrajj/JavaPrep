package Misty;

public class Scope {
    public static void main(String[] args) {
        int a =10;
        int b = 20;

        {
           a = 30;
           b = 20;
           int c = 30;
           System.out.println(c);
        }
        int c = 40;
        System.out.println(a);
        System.out.println(c);
    }
}
