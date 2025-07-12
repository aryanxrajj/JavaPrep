package leetcode;

import java.util.HashSet;

public class Ques2062 {
    public static void main(String[] args) {
        String ex1 = "aeiouu";
        System.out.println(countVowelSubstrings(ex1));

        String ex2 = "unicornarihan";
        System.out.println(countVowelSubstrings(ex2));

        String ex3 = "cuaieuouac";
        System.out.println(countVowelSubstrings(ex3));
    }

    public static int countVowelSubstrings(String word) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for(int i = 0; i < word.length() - 4 ; i++){
            set.clear();
            for(int j = i ; j < word.length(); j++){
                char ch = word.charAt(j);
                if("aeiou".contains(String.valueOf(ch))){
                    set.add(ch);
                    if(set.size() == 5){
                        count++;
                    }
                }else{
                    break;
                }
            }
        }

        return count;
    }
}
