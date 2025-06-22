package Recursion.Level1Ques;

public class Ques2 {
    public static void main(String[] args) {
        System.out.println(factorial(5,1));
        System.out.println(sum(5));
    }

    //Factorial of a Number
    public static int factorial(int n, int fact){
        if(n == 0){
            return fact;
        }

        fact*=n;
        return factorial(n-1,fact);
    }

    //Sum of Number
    public static int sum(int n){
        int sum = 0;
        if(n == 1){
            return n;
        }
        sum+=n;
        int sumFromBelow = sum(n-1);
        sum+=sumFromBelow;
        return sum;
    }
}
