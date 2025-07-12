package leetcode;


public class Ques3307 {
    public static void main(String[] args) {
        System.out.println(kthCharacter(10,new int[] {0,1,0,1}));
    }


    private static char kthCharacter(long k, int[] operations) {
        return helper(k,operations,"a",0);
    }

    //Not Fully Optimized Bcz of BitManipulation Some of the Test Cases are Not Passing
    private static char helper(long k, int[] operations, String s,int j) {
        if(s.length() >= k || j == operations.length){
            int n = (int) k;
            return s.charAt(n-1);
        }

        int op = operations[j];
        StringBuilder sb = new StringBuilder();
        if(op == 0){
            s = s + s;
        }else{
            for(int i = 0;i < s.length(); i++){
                char ch = (char) (s.charAt(i) + 1);
                sb.append(ch);
            }
            s = s + sb;
        }

        j = j+1;

        return helper(k,operations,s,j);
    }
}
