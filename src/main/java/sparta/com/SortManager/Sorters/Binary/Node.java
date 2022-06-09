package sparta.com.SortManager.Sorters.Binary;

public class Node {


    //Declaring the fields , with contructors and getter and setters
    private final int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    //Creating a method for the both sides of the tree on when we enter the value and how it should handle the value.
    //If one side is empty as the value enters the tree it returns true
    public boolean isLeftChildEmpty() {
        if (leftChild == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isRightChildEmpty() {
        if (rightChild == null) {
            return true;
        } else {
            return false;
        }
    }



}