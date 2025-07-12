package LeetCode;

public class Ques1342 {
    public static void main(String[] args) {
        int ans = numberOfSteps(8);
        System.out.println(ans);
    }

     public static int numberOfSteps(int num) {
        return helper(num,0);
    }

    private static int helper(int num, int s) {
        if(num==0){
            return s;
        }

        if(num%2==0){
            return helper(num/2,s+1);
        }else{
            return helper(num-1,s+1);
        }
    }
}
