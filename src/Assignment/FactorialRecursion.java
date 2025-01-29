package Assignment;

public class FactorialRecursion {
    public static void main(String[] args) {
        int ans =factorial(4);
        System.out.println(ans);

    }

    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return  n + factorial(n-1);
        }
    }
}
