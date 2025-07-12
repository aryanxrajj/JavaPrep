package LeetCode;

public class Ques1832 {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(check(str));
        System.out.println(str.length());

    }

    static boolean check(String sentence){
        if(sentence.length()<26){
            return false;
        }

        boolean[] present = new boolean[26];
        for(int i=0;i<sentence.length();i++){
            int letter = sentence.charAt(i) -'a';
            present[letter] = true;
        }

        for(int i=0;i<26;i++){
            if(!present[i]){
                return false;
            }
        }
        return true;
    }
}
