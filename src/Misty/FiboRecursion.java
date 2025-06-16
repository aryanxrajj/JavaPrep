package Misty;

public class FiboRecursion {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }

    static int fibo(int n){
        if(n<2){
            return n;
        }
        int ans  = fibo(n-1)+fibo(n-2);

        return ans;
    }
}
