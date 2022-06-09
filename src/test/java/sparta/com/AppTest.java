package sparta.com;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;


public class AppTest 
{
    /**
     * Rigorous Test :-)

    @Test
    @DisplayName()
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4));
    Assertions.assertThrows(IndexOutOfBoundsException.class, () -> numbers.get(19));

    @Test
    @DisplayName()
    void givenABinaryTree_WhenDeletingElements_ThenTreeDoesNotContainThoseElements() {
        BinaryT bt = createBinaryT();
        assertTrue(bt.containsNode(9));
        bt.delete(9);
        assertFalse(bt.containsNode(9));
    }
     */
    @Test
    public void mergeSortTest() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        SortingAlgorithms.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void bubbleSortTest() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        SortingAlgorithms.bubbleSort(actual);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void tingySortTest() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        SortingAlgorithms.selectionSort(actual);
        assertArrayEquals(expected, actual);
    }
}
    


