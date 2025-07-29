package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Ques496 {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = nums2.length - 1; i >=0; i--){
            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],stack.peek());
            }

            stack.push(nums2[i]);

        }

        for(int i = 0; i < nums1.length;i++){
            int value = map.get(nums1[i]);
            nums1[i] = value;
        }

        return nums1;
    }
}
