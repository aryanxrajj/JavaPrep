package Assignment.leetcode;

import java.util.List;

public class Ques21 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(list1,list2);
        while(result != null){
            System.out.println(result.val + " ");
            result = result.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result= new ListNode();
        ListNode third = result;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                third.next = list1;
                list1 = list1.next;
                third = third.next;
            }else{
                third.next = list2;
                list2 = list2.next;
                third = third.next;
            }
        }

        while(list1 != null){
            third.next = list1;
            list1 = list1.next;
            third = third.next;
        }

        while(list2 != null){
            third.next = list2;
            list2 = list2.next;
            third = third.next;
        }

        return result.next;
    }
}

