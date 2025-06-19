package Recursion;

public class Introduction {
    static int count = 0;
    public static void main(String[] args) {
        print1(1);//Calling the function
        count(1);
    }

    public static void print1(int n){
        print2(2);
        System.out.println(n);
    }

    public static void print2(int n){
        print3(3);
        System.out.println(n);
    }

    public static void print3(int n){
        print4(4);
        System.out.println(n);
    }

    public static void print4(int n){
        print5(5);
        System.out.println(n);
    }

    public static void print5(int n){
        System.out.println(n);
    }

    public static void count(int n){
        if(n == 5){
            return;
        }
        count(n+1);
        System.out.print(n);
    }
}
