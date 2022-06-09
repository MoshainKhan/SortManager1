package sparta.com.SortManager.Sorters.Binary;
//Create a tree(100 :entered the value)- creates a new Node(100)

//publix method -Interface
// Private Method -Implementation

//Can use nested classes for nodes
// Divde and clean

import sparta.com.SortManager.Exception.ChildNotFoundException;

import java.util.ArrayList;

public class BinaryT  implements BinaryTree {

    private final Node rootNode;

    //public method - Interface    //private method - Implementation    private final Node rootNode;
    public BinaryT(final int element) {
        rootNode = new Node(element);
    }

    @Override
    public int getRootElement() {
        return 0;
    }

    public int getNumberOfElements(){
        return countTotalNodes(rootNode);

    }
    private int countTotalNodes(Node root){
        // Base Case
        if (root == null)
            return 0;
        // Otherwise, recursive call
        return 1 + countTotalNodes(root.getLeftChild())
                + countTotalNodes(root.getRightChild());
    }
    public void addElement(final int element) {
        addNodeToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] elements) {

    }

    public boolean findElement(final int element) {
        Node node = findNode(element);
        if (node != null) {
            return true;
        }
        return false;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        return 0;
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        return 0;
    }

    private void addNodeToTree(Node node, int element) {
        if (element < node.getValue()) {
            if (node.isLeftChildEmpty()) {
                Node leftChild = new Node(element);
                node.setLeftChild(leftChild);

            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element > node.getValue()) {
            if (node.isRightChildEmpty()) {
                Node rightChild = new Node(element);
                node.setRightChild(rightChild);
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }
    private Node findNode(final int element) {
        Node node = rootNode;
        while (node != null) {
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    private void inOrder(Node node, ArrayList<Integer> arr){
        if(node != null){
            inOrder(node.getLeftChild(), arr);
            arr.add(node.getValue());
            inOrder(node.getRightChild(), arr);
        }
    }

    private void inOrderDesc(Node node, ArrayList<Integer> arr){
        if(node != null){
            inOrderDesc(node.getRightChild(),arr);
            arr.add(node.getValue());
            inOrderDesc(node.getLeftChild(),arr);
        }
    }
    public int[] getSortedTreeAsc() {
        ArrayList<Integer> sortedArr = new ArrayList<>();
        inOrder(rootNode, sortedArr);
        Object[] a = sortedArr.toArray();
        int[] sortedArr2 = new int[a.length];
        for(int i = 0; i <a.length; i++) {
            sortedArr2[i] = (Integer) a[i];
        }
        return sortedArr2 ;
    }

    public int[] getSortedTreeDesc(){
        ArrayList<Integer> sortedArr = new ArrayList<>();
        inOrderDesc(rootNode, sortedArr);
        Object[] a = sortedArr.toArray();
        int[] sortedArr2 = new int[a.length];
        for(int i = 0; i <a.length; i++) {
            sortedArr2[i] = (Integer) a[i];
        }
        return sortedArr2 ;
    }


}