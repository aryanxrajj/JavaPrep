package Misty;

public class FunctionOverloading {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        int c =30;
        sum(a,b);
        sum(a,b,c);
    }
    static void sum(int a,int b){
        System.out.println(a+b);
    }
    static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

}
