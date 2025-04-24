package Assignment.leetcode;

public class Ques520 {
    public static void main(String[] args) {
        String s = "FlaG";
        System.out.println(detectCapitalUse(s));
    }

    public static boolean detectCapitalUse(String word) {
        char[] ch = word.toCharArray();

        if(word.equals(word.toLowerCase())){
            return true;
        }

        if(word.equals(word.toUpperCase())){
            return true;
        }

        boolean check = Character.isUpperCase(word.charAt(0));

        if(!check){
            return false;
        }else{
            for(int i = 1; i < word.length();i++){
                if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
                    return false;
                }
            }
        }

        return true;
    }
}
