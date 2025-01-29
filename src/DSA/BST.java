package DSA;

import java.util.Scanner;

class Node {
    char data;
    Node left, right;

    public Node(char data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BST{

    // Function to insert a node into the BST
    public static Node insert(Node root, char data) {
        if (root == null) {
            return new Node(data);
        }
        if (data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Function to find the node with the minimum value in the BST
    public static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Function to delete a node from the BST
    public static Node deleteNode(Node root, char data) {
        if (root == null) {
            return null;
        }

        if (data < root.data) {
            root.left = deleteNode(root.left, data); // Search in the left subtree
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data); // Search in the right subtree
        } else {
            // Node to be deleted found
            if (root.left == null && root.right == null) {
                // Case 1: Leaf node
                return null;
            } else if (root.left == null) {
                // Case 2: Node with only right child
                return root.right;
            } else if (root.right == null) {
                // Case 3: Node with only left child
                return root.left;
            } else {
                // Case 4: Node with two children
                Node temp = findMin(root.right); // Find the minimum value in the right subtree
                root.data = temp.data; // Copy the value to the current node
                root.right = deleteNode(root.right, temp.data); // Delete the duplicate node
            }
        }
        return root;
    }

    // Function to perform inorder traversal of the BST
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Node root = null;

        // Insert nodes into the BST
        for (int i = 0; i < size; i++) {
            char input = sc.next().charAt(0);
            root = insert(root, input);
        }

        // Read the character to be deleted
        char charToDelete = sc.next().charAt(0);

        // Delete the specified node from the BST
        root = deleteNode(root, charToDelete);

        // Perform inorder traversal to display the BST
        inorder(root);
        System.out.println();

        sc.close();
    }
}