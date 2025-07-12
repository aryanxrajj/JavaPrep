package leetcode;

import java.util.HashMap;

public class Ques82 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next = new ListNode(5);

        ListNode result = deleteDuplicates2(head);
        while (result != null) {
            System.out.println(result.val + " ");
            result = result.next;
        }
    }

    //BrutForce Approach
    public static ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode temp = head;

        while (temp != null) {
            map.put(temp.val, map.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (map.get(curr.val) == 1) {
                tail.next = new ListNode(curr.val);
                tail = tail.next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }

    //Optimized Solution
    public static ListNode deleteDuplicates2(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode result = new ListNode();
        ListNode ans = result;
        ListNode dummy = head;
        int skipped = 0;
        while (dummy != null) {
            if (dummy.next != null && dummy.val == dummy.next.val) {
                skipped = dummy.val;
                while(dummy != null && dummy.val == skipped){
                    dummy = dummy.next;
                }
            } else {
                if(dummy.val != skipped){
                    ans.next = new ListNode(dummy.val);
                    ans = ans.next;
                }
                dummy = dummy.next;
            }
        }

        return result.next;
    }
}
