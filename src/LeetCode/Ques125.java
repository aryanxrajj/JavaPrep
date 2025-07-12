package leetcode;

public class Ques125 {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)|| Character.isDigit(ch)){
                str.append(ch);
            }
        }
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();

        return str.toString().equals(rev.toString());
    }
}
