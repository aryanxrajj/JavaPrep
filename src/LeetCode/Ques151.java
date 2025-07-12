package LeetCode;

public class Ques151 {
    public static void main(String[] args) {
        String line = "a good   example";
        System.out.println(reverseWords(line));
    }

    public static String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+"," ");
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = words.length-1; i >= 0; i--){
            result.append(words[i]);
            if(i == 0){
                break;
            }else{
                result.append(" ");
            }
        }
        return result.toString();
    }
}
