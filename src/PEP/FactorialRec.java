package PEP;

public class FactorialRec {
    public static void main(String[] args) {
        System.out.println(factorial2(5));
    }

    //Factorial of a Number
    public static long factorial(long n, long fact){
        if(n == 0){
            return fact;
        }

        fact*=n;
        return factorial(n-1,fact);
    }

    public static long factorial2(long n){
        long fact = 1;
        for(long i = 1;i <= n;i++){
            fact*=i;
        }

        return fact;


    }
}
