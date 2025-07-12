package leetcode;

import java.util.HashMap;

public class Ques2053 {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        System.out.println(kthDistinct(arr,2));
    }

    public static String kthDistinct(String[] arr, int k) {
        int distinct = 1;
        HashMap<String,Integer> map = new HashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for(String s : arr){
            if(map.get(s) == 1){
                if(distinct == k){
                    return s;
                }
                distinct++;
            }
        }

        return "";
    }
}
