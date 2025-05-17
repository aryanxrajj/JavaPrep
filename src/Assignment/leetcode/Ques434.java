package Assignment.leetcode;

import java.util.Objects;

public class Ques434 {
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));

        String s1 = "Hello";
        System.out.println(countSegments(s1));

        String s2 = ", , , ,        a, eaefa";
        System.out.println(countSegments(s2));

        String s3 = "    foo    bar";
        System.out.println(countSegments(s3));
    }

    public static int countSegments(String s){
        String[] str = s.split(" ");

        int count = 0;
        for(String i : str){
            if(!Objects.equals(i,"")){
                count++;
            }
        }

        return count;
    }
}
