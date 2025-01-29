package Assignment.leetcode;

public class Ques367 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isPerfectSquare(n));
    }

    static boolean isPerfectSquare(int num) {
        for(int i=0;i<=num;i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
    }

}
