package DSA.LinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;

    public void inserthead(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        while(last!=null){
            System.out.print(last.value+" -> ");
            last = last.prev;
        }
        System.out.println("START");
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
        DoublyLinkedList list = new DoublyLinkedList();
        list.inserthead(10);
        list.inserthead(20);
        list.inserthead(30);
        list.inserthead(40);
        list.inserthead(50);
        list.display();

    }
}
