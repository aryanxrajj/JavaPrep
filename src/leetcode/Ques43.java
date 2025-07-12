package leetcode;

import java.math.BigInteger;

public class Ques43 {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";

        System.out.println(multiply(num1,num2));
    }

    public static  String multiply(String num1, String num2) {
        int first = 0;
        int second = 0;

        for(char ch : num1.toCharArray()){
            first = first * 10 + ch - '0';
        }

        for(char ch : num2.toCharArray()){
            second = second * 10 + ch -'0';
        }

        BigInteger a = new BigInteger(String.valueOf(first));
        BigInteger b = new BigInteger(String.valueOf(second));

        return String.valueOf(a.multiply(b));
    }
}
