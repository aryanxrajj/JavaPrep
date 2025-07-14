package DSA.Stack;
import java.util.Arrays;
import java.util.Stack;

public class MonotonicStack {
    public static void main(String[] args) {
        int[] nums = {73, 74, 75, 71, 69, 72, 76};
        System.out.println(Arrays.toString(NGE(nums)));
        System.out.println(Arrays.toString(NSE(nums)));
    }

    //NSG Greater Element
    public static int[] NGE(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--){

            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);
        }

        return result;
    }

    //Next Smaller Element
    public static int[] NSE(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = arr.length - 1; i >=0 ; i--){
            while(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);
        }

        return result;
    }
}
