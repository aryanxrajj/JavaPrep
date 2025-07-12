package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Ques884 {
    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        System.out.println(Arrays.toString(uncommonFromSentences(s1,s2)));;
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        String s3 = s1+" "+s2;
        String[] arr = s3.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for(String s : arr){
            map.put(s,map.getOrDefault(s,0) + 1);
        }

        String[] result = new String[map.size()];
        int i = 0;
        for(String s : arr){
            if(map.get(s) == 1){
                result[i++] = s;
            }
        }

        return Arrays.copyOfRange(result,0,i);
    }
}
