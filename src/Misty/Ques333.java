package Misty;

public class Ques333 {
    public static void main(String[] args) {
        System.out.println(kthSmallest(5));
    }

    private static char kthSmallest(int k) {
        return helper(k,"a");
    }

    private static char helper(int k, String s) {
        if(s.length() >= k){
            return s.charAt(k-1);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'z'){
                sb.append('a');
            }else{
                char ch = (char)(s.charAt(i) + 1);
                sb.append(ch);
            }
        }

        s = s +sb;

        return helper(k,s);

    }
}
