package LeetCode;

class ListNode{
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class Ques19 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        ListNode result = removeNthFromEnd(head , 2);

        while (result!= null){
            System.out.print(result.val + "->");
            result = result.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }

        ListNode temp = head;
        int count = 0;

        while(temp != null){
            temp = temp.next;
            count++;
        }

        if(count == 1){
            head = null;
            return head;
        }

        if(n == count){
            return head.next;
        }

        ListNode behind = head;
        for(int i = 1;i < count - n; i++){
            behind = behind.next;
        }

        behind.next = behind.next.next;

        return head;
    }
}
