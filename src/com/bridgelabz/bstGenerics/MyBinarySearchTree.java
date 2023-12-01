package com.bridgelabz.bstGenerics;/*
 * @name:MyBinarySearchTree
 * @description: used to create a binary search tree.
 * @param: K extends Comparable<K>
 */

public class MyBinarySearchTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    public MyBinarySearchTree() {
        this.root = null;
    }
    /*
     * @name:add
     * @description: used to add a node to the binary search tree.
     * @param: K key
     * @return: void
     */
    public void add(K key) {
        root = addRecursive(root, key);
    }
    /*
     * @name:addRecursive
     * @description: used to add a node to the binary search tree recursively.
     * @param: MyBinaryNode<K> node, K key
     * @return: MyBinaryNode<K>
     */
    private MyBinaryNode<K> addRecursive(MyBinaryNode<K> node, K key) {
        if (node == null) {
            return new MyBinaryNode<>(key);
        }

        if (key.compareTo(node.key) < 0) {
            node.left = addRecursive(node.left, key);
        } else if (key.compareTo(node.key) > 0) {
            node.right = addRecursive(node.right, key);
        }

        return node;
    }
    /*
     * @name:inOrderTraversal
     * @description: used to display the in-order traversal of the binary search tree.
     * @param: void
     * @return: void
     */
    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }
    /*
     * @name:inOrderTraversalRecursive
     * @description: used to display the in-order traversal of the binary search tree recursively.
     * @param: MyBinaryNode<K> node
     * @return: void
     */
    private void inOrderTraversalRecursive(MyBinaryNode<K> node) {
        if (node != null) {
            inOrderTraversalRecursive(node.left);
            System.out.print(node.key + " ");
            inOrderTraversalRecursive(node.right);
        }
    }
}
