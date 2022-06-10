package sparta.com.prints;


import sparta.com.SortManager.Exception.SorterLoaderException;
import sparta.com.SortManager.Sorters.SortFactory;
import sparta.com.SortManager.Sorters.Sorter;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;




public class MainFile {
    public static void main(String[] args) throws SorterLoaderException {

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


        // Output Sorted Array & Time Taken (Performance Test)

        long startTime = 0, endTime = 0;
        System.out.println("\n");
        Sorter s = SortFactory.getSorter(sortAlgorithm);
        startTime = System.nanoTime();
        s.sort(generatedNumbers);
        endTime = System.nanoTime();


        //Calculate the time taken to run the program from start to end
        System.out.println("Sorted Array: " + Arrays.toString(generatedNumbers));
        long duration = (endTime - startTime); // /1000000 to Ms
        System.out.println("Time Taken: " + duration + " Ns"); // Fastest algorithms order: BinaryTree ,MergeSort, Selection, Bubble

    }

    public static void printResult(Sorter sorter, int[] unsortedArray) {
    }
}
