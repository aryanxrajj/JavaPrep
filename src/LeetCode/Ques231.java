package LeetCode;

public class Ques231 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isPowerOfTwo(n));

        int n2 = 16;
        System.out.println(isPowerOfTwo(n2));

        int n3 = 3;
        System.out.println(isPowerOfTwo(n3));
    }

    public static boolean isPowerOfTwo(int n) {
        return checkpow(1,n);
    }

    public static boolean checkpow(int i, int n) {
        if(n == 1){
            return true;
        }

        if(i > n){
            return false;
        }

        if(Math.pow(2,i) == n){
            return true;
        }else if(Math.pow(2,i) > n){
            return false;
        }else{
            return checkpow(i+1,n);
        }

    }

}
