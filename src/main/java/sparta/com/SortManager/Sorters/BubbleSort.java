package sparta.com.SortManager.Sorters;

public class BubbleSort implements Sorter{
    public BubbleSort(){}

    public void sort(int array[]) {
        int size = array.length;

        // loop to access each array element
        for (int i = 0; i < size - 1; i++)

            // loop to compare array elements
            for (int max = 0; max < size - i - 1; max++)

                // compare two adjacent elements
                // change > to < to sort in descending order
                if (array[max] > array[max + 1]) {

                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = array[max];
                    array[max] = array[max + 1];
                    array[max + 1] = temp;
                }
    }
}
