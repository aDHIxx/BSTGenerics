public class MyBinaryNode<K extends Comparable<K>> {
    K key;
    MyBinaryNode<K> left;
    MyBinaryNode<K> right;
    /*
     * @name:MyBinaryNode
     * @description: used to initialize the key, left and right child of the node.
     * @param: K key
     * @return: void
     */
    public MyBinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}