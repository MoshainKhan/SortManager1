package sparta.com.SortManager.Sorters;

import sparta.com.SortManager.Exception.SorterLoaderException;
import sparta.com.SortManager.Sorters.Binary.BinaryT;
import sparta.com.SortManager.Sorters.BubbleSort;
import sparta.com.SortManager.Sorters.Merge;
import sparta.com.SortManager.Sorters.Selection;
import sparta.com.SortManager.Sorters.Sorter;

public class SortFactory {
    public static Sorter getSorter(int input) throws SorterLoaderException {
        switch(input){
            case 1:
                System.out.println("Algorithm: BubbleSort");
                return new BubbleSort();
            case 2:
                System.out.println("Algorithm: MergeSort");
                return new Merge();
            case 3:
                System.out.println("Algorithm: SelectionSort");
                return new Selection();
            case 4:
                System.out.println("Algorithm: BinaryTreeSort");
                return new BinaryT();
            default:
                throw new SorterLoaderException("Not Valid options:");
        }
    }
}
