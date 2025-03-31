package Assignment.leetcode;

import java.util.Stack;

public class Ques20 {
    public static void main(String[] args) {
        String s = "{()[]{}}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> result = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '{' || ch == '(' || ch == '['){
                result.push(ch);
            }else{
                if(ch == '}'){
                    if(result.isEmpty() || result.pop() != '{'){
                        return false;
                    }
                }
                if(ch == ')'){
                    if(result.isEmpty() || result.pop() != '('){
                        return false;
                    }
                }
                if(ch == ']'){
                    if(result.isEmpty() || result.pop() != '['){
                        return false;
                    }
                }
            }
        }

        return result.isEmpty();
    }
}
