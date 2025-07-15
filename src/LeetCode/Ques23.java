package LeetCode;

import java.util.PriorityQueue;

public class Ques23 {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next= new ListNode(4);
        head1.next.next = new ListNode(5);

        ListNode head2 = new ListNode(1);
        head2.next= new ListNode(3);
        head2.next.next = new ListNode(4);

        ListNode head3 = new ListNode(2);
        head3.next= new ListNode(6);

        ListNode[] lists = {head1,head2,head3};
        ListNode ans = mergeKLists(lists);

        while(ans!=null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < lists.length;i++){
            while(lists[i] != null){
                queue.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }

        if(queue.isEmpty()){
            return null;
        }

        ListNode result = new ListNode(queue.poll());
        ListNode curr = result;

        while(!queue.isEmpty()){
            curr.next = new ListNode(queue.poll());
            curr = curr.next;
        }

        return result;
    }
}
