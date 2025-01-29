package Revision;

public class SLLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public SLLinkedList() {
        this.size = 0;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head==null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SLLinkedList list = new SLLinkedList();
        list.insert(20);
        list.insert(20);
        list.insert(20);
        list.insert(20);
        list.insert(20);
        list.display();
    }
}
