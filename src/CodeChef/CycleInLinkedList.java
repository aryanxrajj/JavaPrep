package CodeChef;

class Node{
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}

public class CycleInLinkedList {

    public static Node detectCycle(Node head){
        Node current = head,prev = null, next = head.next;

        while(next!=null){
            prev = current;
            current = current.next;
            next = next.next;
        }

        return prev;
    }
    public static void main(String[] args) {
        Node head = new Node(8);
        head.next = new Node(5);
//        head.next.next = new Node(8);

        Node result = detectCycle(head);
        System.out.println(result.data);
    }
}
