package DSA.Stack;

import DSA.DynamicStack;

public class DstackMain {
    public static void main(String[] args) throws Exception {
        DynamicStack stack = new DynamicStack(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
    }
}
