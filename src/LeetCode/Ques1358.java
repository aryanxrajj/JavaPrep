package LeetCode;

import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;
import java.util.Set;

public class Ques1358 {
    public static void main(String[] args) {
        String s = "aaacb";
        System.out.println(numberOfSubstrings(s));
        System.out.println(numberOfSubstrings2(s));
    }

    //This Approach will give you TLE : TC : O(n^2)
    public static int numberOfSubstrings(String s) {
        Set<Character> set = new HashSet<>();
        char[] ch = s.toCharArray();

        int count = 0;
        for(int i = 0; i < ch.length; i++){
            for(int j = i; j < ch.length; j++){
                set.add(ch[j]);
                if(set.size() == 3) count++;
            }
            set.clear();
        }

        return count;
    }

    //Optimal Approach Using Sliding Window : TC : O(n)
    public static int numberOfSubstrings2(String s) {
        int n = s.length();
        int[] count = new int[3];
        int left = 0, ans = 0;

        for (int right = 0; right < n; right++) {
            count[s.charAt(right) - 'a']++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                ans += n - right;
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return ans;
    }

}
