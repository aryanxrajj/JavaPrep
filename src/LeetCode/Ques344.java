package LeetCode;

import java.util.Arrays;

public class Ques344 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
//        reverseString(s);
//        System.out.println(Arrays.toString(s));
        reverseStringRec(s,0,s.length - 1);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        int start = 0, end = s.length -1;

        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start ++;
            end --;
        }
    }

    public static void reverseStringRec(char[] ch, int start , int end){
        if(start > end){
            return;
        }

        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;

        reverseStringRec(ch,start+1,end-1);
    }
}
