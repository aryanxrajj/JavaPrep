package DynamicProgramming;

import java.util.Arrays;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(tabufibo(5));
        int n = 5;
        int[] memo = new int[n + 1];
        Arrays.fill(memo , -1);;
        System.out.println(memofibo(n,memo));
    }

    //Tabulation Approach(Bottom to Top Approach)
    public static int tabufibo(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    //Memoization Approach(Top to Bottom Approach)
    public static int memofibo(int n, int[] memo){
        if(n == 0) return 1;
        if(n <= 1) return n;

        if(memo[n] != -1){
            return memo[n];
        }

        memo[n] = memofibo(n - 1, memo)  + memofibo(n-2, memo);

        return  memo[n];

    }
}
