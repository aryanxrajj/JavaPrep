package DSA;

import java.util.Scanner;

class Node {

    int  value;
    Node left, right;

    public Node(){}

    public Node(int value) {
        this.value = value;
        this.left = this.right = null;
    }

    public Node(int value, Node left, Node right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BST{
    Node root;

    public void insert(int key){
        root = insertRec(root,key);
    }

    public Node insertRec(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }

        if(key < root.value){
            root.left = insertRec(root.left,key);
        }else if(key > root.value){
            root.right = insertRec(root.right,key);
        }

        return root;
    }

    public void inorder(){
        inorderRec(root);
    }

    public void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.value + "->");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(30);
        bst.insert(20);
        bst.insert(10);
        bst.insert(40);
        bst.insert(50);

        bst.inorder();
    }
}