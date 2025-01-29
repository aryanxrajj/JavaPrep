package Assignment;

public class LLPr {
    private Node head;
    private Node tail;
    private int size;
    public LLPr(){
        this.size = 0;
    }

    public class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail==null){
            tail = node;
        }
        size++;
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        LLPr list = new LLPr();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.display();

    }
}
