package Assignment.leetcode;

public class Ques541 {
    public static void main(String[] args) {
        String s = "abcdef";
        int k = 2;
        System.out.println(reverseStr(s,k));

        String s2 = "abcd";
        int k2 = 2;
        System.out.println(reverseStr(s2,k2));
    }

    public static String reverseStr(String s, int k) {
        if (s.length() < k) {
            StringBuilder sb = new StringBuilder();
            sb.append(s);
            return sb.reverse().toString();
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += k) {
            String sub = s.substring(i, i + k);
            StringBuilder rec = new StringBuilder(sub);
            rec.reverse();
            result.append(rec);
        }

        return result.toString();

    }
}
