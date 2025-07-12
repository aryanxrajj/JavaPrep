package leetcode;

import java.util.Stack;

public class Ques1653 {
    public static void main(String[] args) {
        String s = "bbaaaaabb";
        System.out.println(minimumDeletions(s));
    }

    public static int minimumDeletions(String s) {
        Stack<Character> stack = new Stack<>();
        int popOperations = 0;
        char[] ch = s.toCharArray();

        for(int i = 0; i < ch.length ;i++){
            if(stack.isEmpty()){
                stack.push(ch[i]);
                continue;
            }

            if(ch[i] == 'a' && stack.peek() == 'b'){
                stack.pop();
                popOperations++;
            }else if(ch[i] == 'b' && stack.peek() == 'a'){
                stack.push(ch[i]);
            }else{
                stack.push(ch[i]);
            }
        }

        return popOperations;


    }
}
