package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Quesun {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(Arrays.toString(new List[]{arraytoint(arr, k)}));
    }

    static List<Integer> arraytoint(int[] num, int k){
        LinkedList<Integer> res = new LinkedList<>();
        int carry = 0;
        int i = 0;
        for (i = num.length - 1; i >= 0 && k > 0; i--) {
            int temp = num[i];
            res.addFirst((temp + carry + (k % 10)) % 10);
            carry = (temp + carry + (k % 10)) / 10;
            k /= 10;
        }
        while (k != 0) {
            int compute = (k % 10) + carry;
            res.addFirst(compute % 10);
            carry = compute / 10;
            k /= 10;
        }
        for (int r = i; r >= 0; r--) {
            int temp = num[r];
            res.addFirst((temp + carry) % 10);
            carry = (temp + carry) / 10;
        }
        if (carry != 0) res.addFirst(carry);
        return res;
    }
}
