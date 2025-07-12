package PEP;

public class FiboRec {
    public static void main(String[] args) {
        System.out.println(fibo2(3));
    }

    static long fibo(long n){
        if(n<2){
            return n;
        }
        long ans  = fibo(n-1)+fibo(n-2);

        return ans;
    }

    static long fibo2(long n){
        long fib1 = 0, fib2 = 1;
        long fib3  = 0;

        for(int i = 2; i <=n;i++){
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }

        return fib3;
    }
}
