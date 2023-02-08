import java.sql.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Your implementation of the pre-order, in-order, and post-order
 * traversals of a tree.
 */
public class Traversals<T extends Comparable<? super T>> {

    /**
     * DO NOT ADD ANY GLOBAL VARIABLES!
     */

    /**
     * Given the root of a binary search tree, generate a
     * pre-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the pre-order traversal of the tree.
     */
    public List<T> preorder(TreeNode<T> root) {
        ArrayList<T> foundItems = new ArrayList<>();
        preorder_recursive(root, foundItems);
        return foundItems;
    }

    private void preorder_recursive(TreeNode<T> node, ArrayList<T> listItems){
        T data = null;
        if (node != null){
            data = node.getData();
            listItems.add(listItems.size(), data);
            preorder_recursive(node.getLeft(), listItems);
            preorder_recursive(node.getRight(), listItems);
        }
    }

    /**
     * Given the root of a binary search tree, generate an
     * in-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the in-order traversal of the tree.
     */
    public List<T> inorder(TreeNode<T> root) {
        ArrayList<T> foundItems = new ArrayList<>();
        inorder_recursive(root, foundItems);
        return foundItems;
    }

    private void inorder_recursive(TreeNode<T> node, ArrayList<T> listItems){
        T data = null;
        if (node != null){
            inorder_recursive(node.getLeft(), listItems);
            data = node.getData();
            listItems.add(listItems.size(), data);
            inorder_recursive(node.getRight(), listItems);
        }
    }

    /**
     * Given the root of a binary search tree, generate a
     * post-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the post-order traversal of the tree.
     */
    public List<T> postorder(TreeNode<T> root) {
        ArrayList<T> foundItems = new ArrayList<>();
        postorder_recursive(root, foundItems);
        return foundItems;
    }

    private void postorder_recursive(TreeNode<T> node, ArrayList<T> listItems){
        T data = null;
        if (node != null){
            postorder_recursive(node.getLeft(), listItems);
            postorder_recursive(node.getRight(), listItems);
            data = node.getData();
            listItems.add(listItems.size(), data);
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> node1 = new TreeNode<>(13);
        TreeNode<Integer> node2 = new TreeNode<>(7);
        TreeNode<Integer> node3 = new TreeNode<>(29);
        TreeNode<Integer> node4 = new TreeNode<>(5);
        TreeNode<Integer> node5 = new TreeNode<>(11);
        TreeNode<Integer> node6 = new TreeNode<>(19);
        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        Traversals<Integer> findOrder = new Traversals<>();
        System.out.println(findOrder.preorder(node1));
        System.out.println(findOrder.inorder(node1));
        System.out.println(findOrder.postorder(node1));

    }







}