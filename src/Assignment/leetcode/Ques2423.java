package Assignment.leetcode;

public class Ques2423 {
    public static void main(String[] args) {
        String s = "abcc";
        System.out.println(equalFrequency(s));

        String s2 = "aazz";
        System.out.println(equalFrequency(s2));
    }

    public static boolean equalFrequency(String word) {
        //Some of the edges Cases are not passing
        int[] count = new int[26];

        for(char c : word.toCharArray()){
            count[c - 'a']++;
        }

        int total = 0;
        for (int j : count) {
            if (j > 1) {
                total++;
            }
            if (total > 1) {
                return false;
            }
        }
        return true;
    }
}
