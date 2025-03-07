package com.example.dsa.sortingsTest;

import com.example.dsa.sort.QuickSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void testQuickSortWithUnsortedArray() {
        QuickSort quickSort = new QuickSort();
        int[] input = {5, 2, 9, 1, 5, 6};
        int[] expected = {1, 2, 5, 5, 6, 9};

        // Manually specifying low and high indices for the quickSort call
        quickSort.sort(input, 0, input.length - 1); // Now passing low and high

        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSortWithSortedArray() {
        QuickSort quickSort = new QuickSort();
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        quickSort.sort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSortWithReverseArray() {
        QuickSort quickSort = new QuickSort();
        int[] input = {9, 7, 5, 3, 1};
        int[] expected = {1, 3, 5, 7, 9};

        quickSort.sort(input, 0, input.length - 1); // Same here
        assertArrayEquals(expected, input); // Verifying the sorted array
    }

    @Test
    public void testQuickSortWithEmptyArray() {
        QuickSort quickSort = new QuickSort();
        int[] input = {};
        int[] expected = {};

        quickSort.sort(input, 0, input.length - 1); // Same here
        assertArrayEquals(expected, input); // Verifying the sorted array
    }
}
