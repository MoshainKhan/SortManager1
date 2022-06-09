package sparta.com.SortManager.Sorters.Binary;

import sparta.com.SortManager.Exception.ChildNotFoundException;

/*
left node is for less then the node and right is greater then

 */
public interface BinaryTree {

        int getRootElement();//done

        int getNumberOfElements();//done

        void addElement(int element);//done

        void addElements(final int[] elements);//done

        boolean findElement(int value);//done

        int getLeftChild(int element) throws ChildNotFoundException;

        int getRightChild(int element) throws ChildNotFoundException;

        int[] getSortedTreeAsc();//Declare methods for order

        int[] getSortedTreeDesc();
    }


