package sparta.com;
//Create a tree(100 :entered the value)- creates a new Node(100)

//publix method -Interface
// Private Method -Implementation

public class BinaryT {

    private final Node rootNode;

    public BinaryT(final int element) {
        rootNode = new Node(element);
    }
    public void addElement(final int element){
        addNodeToTree(rootNode, element);
    }
    public boolean findElement(final int element){
        Node node = findNode(element);
        if (node != null){
            return true;
        }return false;
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
                node.setLeftChild(rightChild);
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        }
    }

    private Node findNode(final int element){
        Node node =rootNode;
        while (node !=null){
            if (element==node.getValue()){
                return node;
            }if (element< node.getValue()){
                node =node.getLeftChild();
            }else{
                node=node.getRightChild();
            }
        }
        return null;
    }
}



