package Recursion.Level1Ques;

public class Ques3 {
    public static void main(String[] args) {
        int n = 12345679;
        System.out.println(digitsum(n));

        int n2 = 12345;
        System.out.println(reverseNumber(n2,0));
    }

    //Sum of Digits
    public static int digitsum(int n){
        if(n < 10){
            return n;
        }

        return n % 10 + digitsum(n/10);
    }

    //Reverse a number
    public static int reverseNumber(int n, int rev){
        if(n == 0){
            return rev;
        }

        rev = rev * 10 + n%10;

        return reverseNumber(n/10,rev);
    }
}
