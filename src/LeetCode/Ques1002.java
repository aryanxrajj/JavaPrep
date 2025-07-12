package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Ques1002 {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        List<String> result = commonChars(words);
        System.out.println(result);
    }

    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < words[0].length(); i++){
            char ch = words[0].charAt(i);
            boolean check = false;
            for(int j = 1; j < words.length ; j++){
                if(words[j].contains(String.valueOf(ch))){
                    check = true;
                }else{
                    check = false;
                }
            }

            if(check){
                result.add(String.valueOf(ch));
            }
        }

        return result;
    }
}
