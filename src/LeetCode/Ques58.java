package LeetCode;

public class Ques58 {
    public static void main(String[] args) {
        String s = "    fly me   to   the moon ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        //My method
        s = s.trim().replaceAll("\\s+"," ");
        String[] str = s.split(" ");
        String last  = str[str.length - 1];
        return last.length();

        //Leetcode Method


    }
}
