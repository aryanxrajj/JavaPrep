package LeetCode;

public class Ques2487 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
//        head.next.next.next.next = new ListNode(1);

        ListNode result = removeNodes(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public static ListNode removeNodes(ListNode head) {
        ListNode reversed = reverse(head);
        ListNode dummy = new ListNode(reversed.val);
        ListNode result = dummy;
        ListNode temp = reversed.next;
        int max = dummy.val;
        while (temp != null){
            if(temp.val >= max){
                result.next = new ListNode(temp.val);
                result = result.next;
                max = temp.val;
                temp = temp.next;
            }else{
                temp = temp.next;
            }
        }
        return reverse(dummy);
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}
