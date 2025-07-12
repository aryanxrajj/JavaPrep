package DSA.LinkedList;

public class SLinkedList {

    private Node head;
    private Node tail;
    private int size;
    public SLinkedList(){
        this.size = 0;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    void insert(int value,int index){
        if(size == 0){
            insertFirst(value);
            return;
        }
        if(size==index){
            insertLast(value);
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }

    void deletefirst(){
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
    }

    Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    void deleteLast(){
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

   private class Node{
       private int value;
       private Node next;

       public Node(int value){
           this.value = value;
       }
       public Node(int value,Node next){
           this.value = value;
           this.next = next;
       }

   }

    public static void main(String[] args) {
        SLinkedList list = new SLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertLast(50);
        list.insert(100,3);
        list.display();
        list.deletefirst();
        list.display();
        list.deleteLast();
        list.display();
    }
}
