package sparta.com;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sparta.com.SortManager.Sorters.Binary.BinaryT;
import sparta.com.SortManager.Sorters.BubbleSort;
import sparta.com.SortManager.Sorters.Merge;
import sparta.com.SortManager.Sorters.Selection;
import sparta.com.SortManager.Sorters.Sorter;
import sparta.com.prints.MainFile;

import java.util.Random;

public class PerformanceTesting {
    private static int[] sortArray;

    private int[] unsortedArray;

    @BeforeAll
    public static void arrayset(){
        Random r =new Random();
        sortArray=new int[50];
        for (int i=0;i<sortArray.length;i++){
            sortArray[i]=r.nextInt(1000)+1;
        }
    }
    @BeforeEach
    public void cloneArray(){unsortedArray=sortArray.clone();}
//leave now
    @Test
    @DisplayName("Bubblesort performance test")
    void performanceTestBubblesort(){
        Sorter sorter = new BubbleSort();
        MainFile.printResult(sorter,unsortedArray);
    }

    @Test
    @DisplayName("MergetSort performance test")
    void performanceTestMergeSort(){
        Sorter sorter = new Merge();
        MainFile.printResult(sorter,unsortedArray);
    }

    @Test
    @DisplayName("Selectionsort performance test")
    void performanceTestSelectionsort(){
        Sorter sorter = new Selection();
        MainFile.printResult(sorter,unsortedArray);
    }

    @Test
    @DisplayName("BinaryTreeSort performance test")
    void performanceTestBinaryTreeSort(){
        Sorter sorter = new BinaryT();
        MainFile.printResult(sorter,unsortedArray);
    }
}
