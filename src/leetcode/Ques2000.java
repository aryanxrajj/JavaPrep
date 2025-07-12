package leetcode;


public class Ques2000 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word,ch));
    }

    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        String sub = word.substring(0, index+1);
        String lastsub = word.substring(index+1);

        StringBuilder rev = new StringBuilder(sub);
        rev.reverse();
        rev.append(lastsub);

        return rev.toString();
    }
}
