package LeetCode;

import java.math.BigInteger;

public class Ques1922 {
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(50));
    }

    public static int countGoodNumbers(long n) {
        int[] prime = {0,2,5,7,9};
        int[] noprime = {2,4,6,8};
        StringBuilder result = new StringBuilder();
        for(int i = 0;i < n ;i++){
            if(i % 2 == 0){
                int noprimeN = noprime[(int)(Math.random() * noprime.length)];
                result.append(noprimeN);
            }else{
                int primeN = prime[(int)(Math.random() * prime.length)];
                result.append(primeN);
            }
        }

        BigInteger big = new BigInteger(result.toString());
        BigInteger M = new BigInteger("1000000007");

        int ans = big.mod(M).intValue();
        return ans;
    }
}
