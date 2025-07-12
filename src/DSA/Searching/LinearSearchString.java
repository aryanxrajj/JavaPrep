package DSA.Searching;

import java.util.Arrays;

public class LinearSearchString {
    public static void main(String[] args) {
        String str = "Aryan";
//        System.out.println(str.charAt(0));//charAt function return the String at specific index.
        char target = 'y';
        StringSearch(str,target);
        System.out.println(Arrays.toString(str.toCharArray()));


    }

    static void StringSearch(String str,char target){
        if(str.isEmpty()){
            System.out.println("Empty String");
        }

        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                System.out.println(i);
            }
        }

        for(char ch: str.toCharArray()){
            if(ch==target){
                System.out.println(ch);
            }
        }
    }
}
