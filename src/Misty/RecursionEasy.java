package Misty;

public class RecursionEasy {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }
    //print number in forward and in backward way.
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);

        print(n-1);
    }
    //print the factorial of the number through Recursion.
    static int fact(int n){
        if(n<=1){
            return 1;
        }

        return n * fact(n-1);
    }
}
