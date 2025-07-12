package DSA.Stack;
import java.util.Arrays;
import java.util.Stack;

public class MonotonicStack {
    public static void main(String[] args) {
        int[] nums = {73,74,75,71,69,72,76,73};
        int[] res = nextGreaterElement(nums);
        System.out.println(Arrays.toString(res));
    }

    private static int[] nextGreaterElement(int[] temps) {
        int[] results = new int[temps.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temps.length; i++) {
            while (!stack.isEmpty() && temps[stack.peek()] < temps[i]) {
                results[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }

        return results;
    }
}
