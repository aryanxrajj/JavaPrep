package Assignment.leetcode;

import java.util.HashMap;

public class Ques387 {
    public static void main(String[] args) {
        String s = "leetcode"; // Example 1
        System.out.println(firstUniqChar(s));

        String s2 = "loveleetcode"; // Example 1
        System.out.println(firstUniqChar(s2));

        String s3 = "loveleetcode"; // Example 1
        System.out.println(firstUniqChar(s3));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1 ) {
                return i;
            }
        }

        return -1;
    }
}
