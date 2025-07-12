package LeetCode;

import java.util.Arrays;

public class Ques796 {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s,goal));

        String s2 = "abcde";
        String goal2 = "abced";
        System.out.println(rotateString(s2,goal2));
    }

    public static boolean rotateString(String s, String goal) {
        char[] ch = new char[101];
        char[] ch2 = new char[101];
        for(int i = 0;i < s.length();i++){
            ch[i] = s.charAt(i);
        }

        for(int i = 0;i < goal.length();i++){
            ch2[i] = goal.charAt(i);
        }

        int i = 0;
        while(i < s.length()){
            char temp = ch[0];
            for(int j = 0; j < s.length();j++){
                ch[j] = ch[j+1];
            }
            ch[s.length() - 1] = temp;

            if(Arrays.equals(ch,ch2)){
                return true;
            }

            i++;
        }

        return false;
    }
}
