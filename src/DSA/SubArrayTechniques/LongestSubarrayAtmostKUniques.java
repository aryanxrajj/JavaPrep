package DSA.SubArrayTechniques;

import java.util.HashMap;

public class LongestSubarrayAtmostKUniques {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        System.out.println(longestKSubstr(s,3));
    }

    public static int longestKSubstr(String s, int k) {
        if(s == null || s.isEmpty() || k == 0) return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, maxLen = 0;

        for(int j = 0; j < s.length(); j++){
            char current = s.charAt(j);
            map.put(current, map.getOrDefault(current, 0) + 1);

            while(map.size() > k){
                char removeFromLeft = s.charAt(i++);
                map.put(removeFromLeft,map.getOrDefault(removeFromLeft,0) - 1);
                if(map.get(removeFromLeft) == 0){
                    map.remove(removeFromLeft);
                }
            }

            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
     }
}
