package Assignment.leetcode;


public class Ques21SM {

    private ListNode head;
    private ListNode tail;
    private int size;

    public Ques21SM() {
        size = 0;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(list1 !=  null && list2 != null){
            if(list1.val<=list2.val){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        while(list1 != null){
            current.next = list1;
            list1 = list1.next;
            current = current.next;
        }

        while(list2 != null){
            current.next = list2;
            list2 = list2.next;
            current = current.next;
        }

        return dummy.next;
    }

    void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
        }
        System.out.println();
    }

    public class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void main(String[] args) {
        Ques21SM sol = new Ques21SM();
        // First list: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
        // Second list: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);
        //Returning head after merging the nodes
        ListNode merge = sol.mergeTwoLists(list1,list2);
        sol.display(merge);
    }
}
