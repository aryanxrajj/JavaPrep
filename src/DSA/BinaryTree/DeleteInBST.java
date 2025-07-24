package DSA.BinaryTree;


import java.util.Scanner;

public class DeleteInBST {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Node root = null;
        for (int i = 0; i < 6; i++) {
            int key = input.nextInt();
            root = insertInBST(root, key);
        }

        inorder(root);
        root = deleteNode(root,3);
        System.out.println();
        inorder(root);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    public static Node insertInBST(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.value) {
            root.left = insertInBST(root.left, key);
        } else if (key > root.value) {
            root.right = insertInBST(root.right, key);
        }

        return root;
    }

    public static Node deleteNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.value){
            root.left = deleteNode(root.left,key);
        }else if( key > root.value){
            root.right = deleteNode(root.right,key);
        }else{
            if(root.left == null){
                return root.right;
            }

            if(root.right == null){
                return root.left;
            }

            root.value = findSuccessor(root.right);

            root.right = deleteNode(root.right,root.value);
        }

        return root;
    }

    public static int findSuccessor(Node root){
        int minvalue = root.value;
        while(root.left != null){
            minvalue = root.left.value;
            root = root.left;
        }

        return minvalue;
    }
}
