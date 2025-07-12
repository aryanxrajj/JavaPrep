package LeetCode;

public class Ques2068 {
    public static void main(String[] args) {
        String word1 = "abcdeef";
        String word2 = "abaaacc";

        System.out.println(checkAlmostEquivalent(word1,word2));
    }

    public static boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq1 = new int[26];

        for(int i = 0;i < word1.length();i++){
            freq1[word1.charAt(i) - 'a']++;
            freq1[word2.charAt(i) - 'a']--;
        }

        for (int j : freq1) {
            if (Math.abs(j) > 3) {
                return false;
            }
        }

        return true;
    }
}
