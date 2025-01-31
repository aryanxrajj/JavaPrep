package CodeChef;

public class CriticalPoints {

    public static class Node{
        int data;
        Node next;

        public Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    static int criticalPoints(Node head){
        Node prev = null, current = head, next = head.next;
        int CountCritialPoints = 0;
        while(next!=null){
            if(prev!=null){
                if((prev.data < current.data && next.data < current.data) || (prev.data > current.data && next.data > current.data)){
                    CountCritialPoints++;
                }
            }
            prev = current;
            current = next;
            next = next.next;
        }

        return CountCritialPoints;
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next = new Node(2);

        System.out.println(criticalPoints(head));
    }
}
