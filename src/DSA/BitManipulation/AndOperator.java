package DSA.BitManipulation;

public class AndOperator {
    public static void main(String[] args) {
        System.out.println(even(10));
        System.out.println(PowerOfTwo(4));
    }

    // Finding the Even Number
    public static boolean even(int n){
        return (n & 1) == 0; //If the Number is LSB is 0 and Number is Odd LSB is 1
    }

    //Finding the Power Of 2;
    public static boolean PowerOfTwo(int n){
        return n > 0 && (n & (n - 1)) == 0;
    }
}
