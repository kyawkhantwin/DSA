package com.example.dsa.selectionSortTest;

import com.example.dsa.bubbleSort.BubbleSort;
import com.example.dsa.selectionSort.SelectionSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {

    @Test
    public void testSortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        SelectionSort selectionSort = new SelectionSort(input);
        int[] result = selectionSort.sort();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result, "Already sorted array should remain unchanged");
    }

    @Test
    public void testReverseArray() {
        int[] input = {5, 4, 3, 2, 1};
        SelectionSort selectionSort = new SelectionSort(input);
        int[] result = selectionSort.sort();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result, "Reverse array should be sorted");
    }

    @Test
    public void testUnsortedArray() {
        int[] input = {3, 1, 4, 2, 5};
        SelectionSort selectionSort = new SelectionSort(input);
        int[] result = selectionSort.sort();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result, "Unsorted array should be sorted");
    }

    @Test
    public void testArrayWithDuplicates() {
        int[] input = {4, 1, 3, 3, 2};
        SelectionSort selectionSort = new SelectionSort(input);
        int[] result = selectionSort.sort();
        assertArrayEquals(new int[]{1, 2, 3, 3, 4}, result, "Array with duplicates should be sorted");
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        SelectionSort selectionSort = new SelectionSort(input);
        int[] result = selectionSort.sort();
        assertArrayEquals(new int[]{}, result, "Empty array should remain empty after sorting");
    }

    @Test
    public void testSingleElementArray() {
        int[] input = {42};
        SelectionSort selectionSort = new SelectionSort(input);
        int[] result = selectionSort.sort();
        assertArrayEquals(new int[]{42}, result, "Single-element array should remain unchanged");
    }
}
