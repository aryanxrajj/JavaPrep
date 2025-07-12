package DSA;

public class CircularLL {

    private Node head;
    private Node tail;
    private int size;

    public CircularLL() {
        this.size = 0;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head==null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            node.next = head;
            tail = node;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        int count = 1;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
            if(( 2*size)==count){
                break;
            }
            count++;
        }
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
        CircularLL list = new CircularLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.display();
    }
}
