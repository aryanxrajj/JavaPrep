package LeetCode;

public class Ques3340 {
    public static void main(String[] args) {
        String s = "24123";
        System.out.println(isBalanced(s));
    }

    public static boolean isBalanced(String num) {
        int even = 0, odd = 0;
        for(int i = 0;i < num.length();i++){
            char ch = num.charAt(i);
            if(i % 2 == 0){
                even+=ch - '0';
            }else{
                odd+=ch - '0';
            }
        }

        if(even == odd){
            return true;
        }else{
            return false;
        }
    }
}
