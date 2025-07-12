package Assignment.leetcode;

public class Ques1941 {
    public static void main(String[] args) {
        String s = "abacbc";
        System.out.println(areOccurrencesEqual(s));

        String s2 = "aaabb";
        System.out.println(areOccurrencesEqual(s2));

    }

    public static boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        int check = 0;

        for(int i = 0; i < s.length(); i++){
            if(i == 0) {
                check = freq[s.charAt(i) - 'a'];
            }else{
                if(freq[s.charAt(i)-'a'] != check){
                return false;
                }
            }
        }

        return true;
    }
}
