package com.bridgelabz.bstGenerics;

public class Main {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();

        bst.add(56);
        bst.add(30);
        bst.add(22);
        bst.add(11);
        bst.add(3);
        bst.add(16);
        bst.add(40);
        bst.add(70);
        bst.add(60);
        bst.add(95);
        bst.add(65);
        bst.add(63);
        bst.add(67);

        // Displaying the in-order traversal of the BST
        System.out.println("In-order traversal of the BST:");
        bst.inOrderTraversal();
        int keyToSearch = 63;
        boolean isFound = bst.search(keyToSearch);

        if (isFound) {
            System.out.println("\nKey " + keyToSearch + " found");
        } else {
            System.out.println("\nKey " + keyToSearch + " not found");
        }
    }
}