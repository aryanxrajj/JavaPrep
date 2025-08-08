package LeetCode;

public class Ques1721 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;
        ListNode ans = swapNodes(head,k);
        while(ans != null){
            System.out.println(ans.val + " ");
            ans = ans.next;
        }
    }

    public static ListNode swapNodes(ListNode head, int k) {
        if((head.next == null && k == 1)){
            return head;
        }

        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        ListNode first = head;
        ListNode second = head;

        for(int i = 0; i < k - 1 ; i++){
            first = first.next;
        }

        for(int i = 0; i < count - k ; i++){
            second = second.next;
        }

        first.val = first.val ^ second.val;
        second.val = first.val ^ second.val;
        first.val = first.val ^ second.val;

        return head;
    }

}
