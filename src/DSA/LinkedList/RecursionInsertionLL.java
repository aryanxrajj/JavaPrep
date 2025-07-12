package DSA;

public class RecursionInsertionLL {

    private Node head;
    private Node tail;
    private int size;

    public RecursionInsertionLL() {
        this.size = 0;
    }

    public void insert(int value){
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

    public void display(){
        Node temp = head;
        System.out.println(temp.next.value);
    }

    public class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        RecursionInsertionLL list = new RecursionInsertionLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.display();

    }
}
