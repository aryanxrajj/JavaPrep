package LeetCode;

public class Ques24 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        ListNode ans = swapPairs(head);
        while(ans != null){
            System.out.println(ans.val + " ");
            ans = ans.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != null && fast != null){
            int temp = slow.val;
            slow.val = fast.val;
            fast.val = temp;

            if(fast.next == null || fast.next.next == null)
                break;

            slow = slow.next.next;
            fast = fast.next.next;
        }

        return head;
    }
}
