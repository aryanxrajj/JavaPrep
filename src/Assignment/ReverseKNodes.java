package Assignment;

import java.util.Scanner;

public class ReverseKNodes {

    private Node head;
    private Node tail;
    private int size;

    public ReverseKNodes() {
        this.size = 0;
    }

    void insert(int value){
        Node node = new Node(value);
        if(head==null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
    }

    Node ReverseK(Node head,int k){
        if(head ==null){
            return null;
        }
        Node current = head;
        Node next = null;
        Node prev = null;
        int count = 0;

        while(current!=null&&count<k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if(next!=null){
            head.next = ReverseK(next,k);
        }

        return prev;
    }

    void reverseInGroups(int k){
        head = ReverseK(head,k);
    }

    void display(){
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

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ReverseKNodes list = new ReverseKNodes();
        for(int i=0;i<5;i++){
            int n;
            n = input.nextInt();
            list.insert(n);
        }
        list.display();
        int k;
        k = input.nextInt();
        list.reverseInGroups(3);
        list.display();
    }
}
