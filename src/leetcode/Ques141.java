package leetcode;

import java.util.HashSet;

public class Ques141 {
    public static void main(String[] args) {
        int[] values1 = {3, 2, 0, -4};
        int pos1 = 1;
        ListNode head1 = createLinkedList(values1, pos1);
        System.out.println("Example 1: " + hasCycleHashSet(head1));  // true

        // Example 2
        int[] values2 = {1, 2};
        int pos2 = 0;
        ListNode head2 = createLinkedList(values2, pos2);
        System.out.println("Example 2: " + hasCycleHashSet(head2));  // true

        // Example 3
        int[] values3 = {1};
        int pos3 = -1;
        ListNode head3 = createLinkedList(values3, pos3);
        System.out.println("Example 3: " + hasCycleHashSet(head3));  // false
    }

    public static ListNode createLinkedList(int[] values, int pos) {
        if (values.length == 0) return null;

        ListNode[] nodes = new ListNode[values.length];
        for (int i = 0; i < values.length; i++) {
            nodes[i] = new ListNode(values[i]);
        }

        for (int i = 0; i < values.length - 1; i++) {
            nodes[i].next = nodes[i + 1];
        }

        if (pos != -1) {
            nodes[values.length - 1].next = nodes[pos];
        }

        return nodes[0];
    }
    //Tortoise And Hare Algorithm(Floyd Cycle detection Algorithm)
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null &&  fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    public static boolean hasCycleHashSet(ListNode head){
        HashSet<ListNode> visited = new HashSet<>();

        ListNode temp = head;

        while(temp != null){
            if(visited.contains(temp)){
                return true; //Cycle Found
            }
            visited.add(temp);
            temp = temp.next;
        }

        return false;
    }
}
