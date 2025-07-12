package leetcode;

public class Ques917 {
    public static void main(String[] args) {
        String s = "ab-cd";
        System.out.println(reverseOnlyLetters(s));
    }

    public static String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int start = 0, end = ch.length - 1;

        while(start < end){
            if(Character.isLetter(ch[start]) && Character.isLetter(ch[end])){
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }

            if(!Character.isLetter(ch[start])){
                start++;
            }

            if(!Character.isLetter(ch[end])){
                end--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : ch){
            sb.append(c);
        }

        return sb.toString();
    }
}
