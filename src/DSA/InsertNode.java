package DSA;

public class InsertNode {

    private Node head;
    private Node tail;
    private int size;

    public InsertNode(){
        this.size = 0;
    }

    public void insertheadtail(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void insertfirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public void insertlast(int value){
        Node node = new Node(value);
        tail.next = node;
        tail= node;
    }

    public void insertposition(int value,int index){
        if(head==null){
            insertheadtail(value);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
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
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
        Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        InsertNode list = new InsertNode();
        list.insertheadtail(10);
        list.insertheadtail(20);
        list.insertheadtail(30);
        list.insertheadtail(40);
        list.insertheadtail(50);
        list.display();
        list.insertposition(60,2);
        list.display();
        list.insertfirst(70);
        list.display();
        list.insertlast(80);
        list.display();
    }
}
