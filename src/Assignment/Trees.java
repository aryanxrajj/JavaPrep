package Assignment;

import java.util.Scanner;

public class Trees {

    public Trees() {

    }

    private Node root;

    public class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void populate(Scanner scanner){
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        this.root = new Node(value);
        populate(scanner,root);
    }

    public void populate(Scanner scanner,Node root){

    }
}
