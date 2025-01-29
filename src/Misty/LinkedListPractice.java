package Misty;

public class LinkedListPractice {
    private Node head;
    private Node tail;
    private int size;
    public LinkedListPractice(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        if(head==null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;

    }

    void display(){
       Node temp = head;
       if(temp.value==temp.next.value){
           System.out.println("True");
       }else{
           System.out.println("False");
       }

        System.out.println(temp.next.value);
    }

    public class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        LinkedListPractice list  = new LinkedListPractice();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.display();
    }
}
