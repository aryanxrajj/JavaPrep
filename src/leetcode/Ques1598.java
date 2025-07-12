package leetcode;

import java.util.*;
public class Ques1598 {
    public static void main(String[] args) {
        String[] arr = {"./","ho3/","tl8/"};
        System.out.println(minOperations(arr));
    }

    public static int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for(int i = 0;i < logs.length;i++){
            if(logs[i].equals("../")){
                continue;
            }else if(logs[i].equals("./") && !stack.isEmpty()){
                stack.pop();
            }else if(!logs[i].equals("../") && !logs[i].equals("./")){
                stack.push(logs[i]);
            }
        }

        return stack.size() == 1 ? 0 : stack.size();
    }
}
