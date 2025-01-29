package Assignment.leetcode;

public class Ques21 {

    private Node head;
    private Node tail;
    private int size;

    public Ques21() {
        this.size = 0;
    }

    public static Ques21 mergeTwoLists(Ques21 first, Ques21 second) {
        Node f = first.head;
        Node s = second.head;
        Ques21 third = new Ques21();
        while(f != null && s != null){
            if(f.val<s.val){
                third.insert(f.val);
                f = f.next;
            }else{
                third.insert(s.val);
                s = s.next;
            }
        }

        while(f != null){
            third.insert(f.val);
            f = f.next;
        }

        while(s != null){
            third.insert(s.val);
            s = s.next;
        }

        return third;

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
        Ques21 first = new Ques21();
        Ques21 second = new Ques21();
        first.insert(1);
        first.insert(2);
        first.insert(4);
        second.insert(1);
        second.insert(3);
        second.insert(4);
        Ques21 ans  = mergeTwoLists(first,second);
        ans.display();
    }
}
