package Assignment.leetcode;

public class Ques7 {
    public static void main(String[] args) {
        int x = -2147483412;
        System.out.println(reverseinteger(x));
    }

    static int reverseinteger(int x){
        long min = Integer.MIN_VALUE;
        long max = Integer.MAX_VALUE;

        long rev = 0;
        while(x!=0){
            rev = rev*10+x%10;
            x/=10;
        }
        if(rev<min || rev>max){
            return 0;
        }
        return (int) rev;
    }
}