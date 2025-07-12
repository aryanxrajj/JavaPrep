package Assignment.leetcode;

import java.util.HashMap;
import java.util.Objects;

public class Ques290 {
    public static void main(String[] args) {
        String patter = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(patter,s));

        String pattern = "abba";
        String s2 = "dog cat cat fish";
        System.out.println(wordPattern(pattern,s2));

        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        System.out.println(wordPattern(pattern3,s3));
    }

    public static boolean wordPattern(String pattern, String s) {
        char[] ch = pattern.toCharArray();
        String[] arr = s.split(" ");

        if(ch.length != arr.length){
            return false;
        }

        HashMap<Character,String> map = new HashMap<>();

        for(int i = 0; i < ch.length; i++){
            if(map.containsValue(arr[i]) || map.containsKey(ch[i])){
                if(!Objects.equals(map.get(ch[i]), arr[i])){
                    return false;
                }
            }
            map.put(ch[i],arr[i]);
        }

        return true;
    }
}
