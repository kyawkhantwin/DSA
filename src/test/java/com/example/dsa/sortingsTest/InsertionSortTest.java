package com.example.dsa.sortingsTest;

import static org.junit.Assert.*;

import com.example.dsa.sort.InsertionSort;
import org.junit.Test;

public class InsertionSortTest {

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        InsertionSort insertionSort = new InsertionSort(arr);
        int[] sortedArr = insertionSort.sort();
        assertArrayEquals("Array should be empty", new int[]{}, sortedArr);
    }

    @Test
    public void testSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        InsertionSort insertionSort = new InsertionSort(arr);
        int[] sortedArr = insertionSort.sort();
        assertArrayEquals("Array is already sorted, should remain unchanged", new int[]{1, 2, 3, 4, 5}, sortedArr);
    }

    @Test
    public void testReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        InsertionSort insertionSort = new InsertionSort(arr);
        int[] sortedArr = insertionSort.sort();
        assertArrayEquals("Array should be sorted in ascending order", new int[]{1, 2, 3, 4, 5}, sortedArr);
    }

    @Test
    public void testArrayWithDuplicates() {
        int[] arr = {3, 1, 2, 3, 2};
        InsertionSort insertionSort = new InsertionSort(arr);
        int[] sortedArr = insertionSort.sort();
        assertArrayEquals("Array with duplicates should be sorted correctly", new int[]{1, 2, 2, 3, 3}, sortedArr);
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        int[] arr = {-1, -3, -2, 0, 2};
        InsertionSort insertionSort = new InsertionSort(arr);
        int[] sortedArr = insertionSort.sort();
        assertArrayEquals("Array with negative numbers should be sorted correctly", new int[]{-3, -2, -1, 0, 2}, sortedArr);
    }

    @Test
    public void testArrayWithSingleElement() {
        int[] arr = {5};
        InsertionSort insertionSort = new InsertionSort(arr);
        int[] sortedArr = insertionSort.sort();
        assertArrayEquals("Array with one element should remain unchanged", new int[]{5}, sortedArr);
    }

    @Test
    public void testArrayWithAllEqualElements() {
        int[] arr = {7, 7, 7, 7};
        InsertionSort insertionSort = new InsertionSort(arr);
        int[] sortedArr = insertionSort.sort();
        assertArrayEquals("Array with all equal elements should remain unchanged", new int[]{7, 7, 7, 7}, sortedArr);
    }

    @Test
    public void testArrayWithLargeNumbers() {
        int[] arr = {100000, 50000, 1000, 99999};
        InsertionSort insertionSort = new InsertionSort(arr);
        int[] sortedArr = insertionSort.sort();
        assertArrayEquals("Array with large numbers should be sorted correctly", new int[]{1000, 50000, 99999, 100000}, sortedArr);
    }

    @Test
    public void testArrayWithMixedPositiveAndNegative() {
        int[] arr = {-1, 5, -3, 2, 4};
        InsertionSort insertionSort = new InsertionSort(arr);
        int[] sortedArr = insertionSort.sort();
        assertArrayEquals("Array with mixed positive and negative numbers should be sorted correctly", new int[]{-3, -1, 2, 4, 5}, sortedArr);
    }

    @Test
    public void testLargeArray() {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = 1000 - i; // reverse sorted array
        }
        InsertionSort insertionSort = new InsertionSort(arr);
        int[] sortedArr = insertionSort.sort();
        for (int i = 0; i < 1000; i++) {
            assertEquals("Array should be sorted correctly", i + 1, sortedArr[i]);
        }
    }
}
