package leetcode;

public class Ques1967 {
    public static void main(String[] args){
        String[] arr = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(arr,word));
    }

    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String s : patterns){
            if(word.contains(s)){
                count++;
            }
        }

        return count;
    }
}
