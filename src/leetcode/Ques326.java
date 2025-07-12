package leetcode;

public class Ques326 {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerOfThree(n));

        int n2 = 0;
        System.out.println(isPowerOfThree(n2));

        int n3 = -1;
        System.out.println(isPowerOfThree(n3));
    }

    public static boolean isPowerOfThree(int n) {
        return helper(1,n);
    }

    public static boolean helper(int i, int n){
        if(n == 1){
            return true;
        }

        if(Math.pow(3,i) > n){
            return false;
        }

        if(Math.pow(3,i) == n){
            return true;
        }

        return helper(i+1,n);
    }
}
