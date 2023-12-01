// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();

        // Adding nodes to the BST
        bst.add(56);
        bst.add(30);
        bst.add(70);

        // Displaying the in-order traversal of the BST
        System.out.println("In-order traversal of the BST:");
        bst.inOrderTraversal();
    }
}