package Assignment.leetcode;

public class Ques1768 {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        String result = mergeAlternately(word1,word2);
        System.out.println(result);

    }

    public static String mergeAlternately(String word1, String word2) {
        char[] first = word1.toCharArray();
        char[] second = word2.toCharArray();

        StringBuilder result = new StringBuilder();

        int i = 0,j = 0;
        while(i < first.length && j < second.length){
            result.append(first[i]);
            result.append(second[i]);
            i++;
            j++;
        }

        while(i < first.length){
            result.append(first[i]);
            i++;
        }

        while(j < second.length){
            result.append(second[j]);
            j++;
        }

        return result.toString();
    }
}
