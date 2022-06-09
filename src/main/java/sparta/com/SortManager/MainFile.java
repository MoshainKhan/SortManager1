package sparta.com.SortManager;

//import sun.reflect.generics.tree.Tree;

import sparta.com.SortManager.Sorters.Binary.BinaryT;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static sparta.com.SortManager.SortingAlgorithms.*;


public class MainFile {
    public static void main(String[] args) {

        // Take Input
        Scanner myObj = new Scanner(System.in);
        System.out.print("Choose Sort Algorithm\n\t- BubbleSort - 1\n\t- MergeSort - 2" +
                "\n\t- SelectionSort - 3\n\t- BinaryTreeSort - 4\nEnter Selection: ");
        int sortAlgorithm = myObj.nextInt();

        System.out.print("Enter array Size:");
        int arrayLength = myObj.nextInt();

        // Output Generated Array

        int [] generatedNumbers= new int[arrayLength];
        Random rd = new Random();
        int max = 100, min = 0;
        for (int i = 0; i < generatedNumbers.length; i++) {
            generatedNumbers[i] = rd.nextInt((max - min) + 1) + min;
        }
        System.out.println("Generated Array: " + Arrays.toString(generatedNumbers));


        // Output Sorted Array & Time Taken

        long startTime = 0, endTime = 0;
        System.out.println("\n");

        // Choose 1 for bubblesort alogrithmn
        if (sortAlgorithm == 1) {
            System.out.println("Algorithm: SortingAlgorithms");
            startTime = System.nanoTime();
            bubbleSort(generatedNumbers);
            endTime = System.nanoTime();

        }
        //choose 2 for the MergeSort Alogrithmn
        else if (sortAlgorithm == 2){
            System.out.println("Algorithm: MergeSort");
            startTime = System.nanoTime();
            mergeSort(generatedNumbers,generatedNumbers.length);
            endTime = System.nanoTime();
        }

        // choose 3 for Slection Sort

        else if (sortAlgorithm == 3){
            System.out.println("Algorithm: SelectionSort");
            startTime = System.nanoTime();
            selectionSort(generatedNumbers);
            endTime = System.nanoTime();
        }
        else if(sortAlgorithm == 4) {
            // Init binary tree
            BinaryT tree = new BinaryT(generatedNumbers[0]);
            for (int i = 1; i < generatedNumbers.length ; i++)
                tree.addElement(generatedNumbers[i]);
            // Get Sorted array
            generatedNumbers = tree.getSortedTreeAsc();
        }

        //Calculate the time taken to run the program from start to end
        System.out.println("Sorted Array: " + Arrays.toString(generatedNumbers));
        long duration = (endTime - startTime); // /1000000 to Ms
        System.out.println("Time Taken: " + duration + " Ns"); // Fastest algorithms order: BinaryTree ,MergeSort, Selection, Bubble

    }

}
