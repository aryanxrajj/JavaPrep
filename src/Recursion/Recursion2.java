package DSA;

public class Recursion2 {
    public static void main(String[] args) {
        int ans = count(30002);
        System.out.println(ans);
    }
    // print in number 1 to n in backward and in forward direction.
    public static void print(int n) {
        if(n==0){
            return;
        }
        System.out.print(n);
        print(n-1);
        System.out.print(n);
    }
    // print the factorial of the number.
    public static int fact(int n){
        if(n <= 1){
            return 1;
        }

        return n * fact(n-1);
    }
    //Sum of the digits through recursion.
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sum(n/10);
    }
    //Product of the digits through recursion.
    public static int product(int n){
        if(n==0){
            return 1;
        }

        return (n%10) * product(n/10);
    }
    //Concept of Passing Parameters.
    public static void concept(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
//        concept(n--);//infinite recursion
        concept(--n);
    }
    //Reverse a number through recursion.
    public static void revs(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
    }
    //Count the zeros through recursion.
    public static int count(int n){
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if(n == 0){
            return c;
        }
        if(n%10==0){
            return helper(n/10,c+1);
        }else{
            return helper(n/10,c);
        }
    }
}
