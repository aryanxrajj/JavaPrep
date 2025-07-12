package DSA.LinkedList;

public class DLLInsertNode {

    private Node head;
    private Node tail;
    private int size;

    public DLLInsertNode(){
        this.size = 0;
    }

    public void insertfirst(int value){
        Node node = new Node(value);
        node.next = head;
        if(head!=null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertlast(int value){
        Node node = new Node(value);
        node.next = null;
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    public void insertposition(int value, int index){
        if(index ==0) {
            insertfirst(value);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(value,temp.next,temp);
        temp.next = node;
        size++;

    }

    public void inserthead(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head!=null) {
            head.prev = node;
        }
        if(tail==null){
            tail = head;
        }
        head = node;
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DLLInsertNode list = new DLLInsertNode();
        list.inserthead(10);
        list.inserthead(20);
        list.inserthead(30);
        list.inserthead(40);
        list.inserthead(50);
        list.insertfirst(60);
        list.insertlast(70);
        list.display();
        list.insertposition(80,2);
        list.display();

    }

}