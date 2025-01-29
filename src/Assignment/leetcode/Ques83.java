package Assignment.leetcode;

public class Ques83 {

    private Node head;
    private Node tail;
    private int size;

    public Ques83() {
        this.size = 0;
    }

    public void deleteDuplicates() {
        Node node = head;
        while(node.next!=null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
    }
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("END");
        }

    public void insert(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
    }

    public class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Ques83 list = new Ques83();
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(3);
        list.display();
        list.deleteDuplicates();
        list.display();
    }
}
