package Assignment.leetcode;

public class Ques2351 {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }

    public static char repeatedCharacter(String s) {
        char[] ch = s.toCharArray();
        int[] count = new int[26];

        for(int i = 0; i < ch.length; i++){
            count[ch[i] - 'a']++;
            if(count[ch[i] - 'a'] >= 2){
                return ch[i];
            }
        }

        return ' ';
    }
}
