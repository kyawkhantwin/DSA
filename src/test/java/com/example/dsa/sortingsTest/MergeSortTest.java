package com.example.dsa.sortingsTest;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.example.dsa.sort.MergeSort;
import org.junit.jupiter.api.Test;

public class MergeSortTest {
    MergeSort mergeSort = new MergeSort();



        // ✅ Test: Already Sorted Array
        @Test
        void testSortedArray() {
            int[] arr = {1, 2, 3, 4, 5, 6};
            int[] expected = {1, 2, 3, 4, 5, 6};
            MergeSort.mergeSorting(arr, 0, arr.length - 1);
            assertArrayEquals(expected, arr);
        }

        // ✅ Test: Reverse Sorted Array
        @Test
        void testReverseSortedArray() {
            int[] arr = {6, 5, 4, 3, 2, 1};
            int[] expected = {1, 2, 3, 4, 5, 6};
            MergeSort.mergeSorting(arr, 0, arr.length - 1);
            assertArrayEquals(expected, arr);
        }

        // ✅ Test: Random Unsorted Array
        @Test
        void testRandomArray() {
            int[] arr = {8, 3, 7, 4, 2, 9};
            int[] expected = {2, 3, 4, 7, 8, 9};
            MergeSort.mergeSorting(arr, 0, arr.length - 1);
            assertArrayEquals(expected, arr);
        }

        // ✅ Test: Array with Duplicates
        @Test
        void testArrayWithDuplicates() {
            int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5};
            int[] expected = {1, 1, 2, 3, 4, 5, 5, 6, 9};
            MergeSort.mergeSorting(arr, 0, arr.length - 1);
            assertArrayEquals(expected, arr);
        }

        // ✅ Test: Single Element Array
        @Test
        void testSingleElementArray() {
            int[] arr = {42};
            int[] expected = {42};
            MergeSort.mergeSorting(arr, 0, arr.length - 1);
            assertArrayEquals(expected, arr);
        }

        // ✅ Test: Empty Array
        @Test
        void testEmptyArray() {
            int[] arr = {};
            int[] expected = {};
            MergeSort.mergeSorting(arr, 0, arr.length - 1);
            assertArrayEquals(expected, arr);
        }

        // ✅ Test: Array with Negative Numbers
        @Test
        void testNegativeNumbersArray() {
            int[] arr = {-3, -1, -7, -4, 0, 2, 1};
            int[] expected = {-7, -4, -3, -1, 0, 1, 2};
            MergeSort.mergeSorting(arr, 0, arr.length - 1);
            assertArrayEquals(expected, arr);
        }

        // ✅ Test: Mixed Positive and Negative Numbers
        @Test
        void testMixedNumbersArray() {
            int[] arr = {3, -1, 4, -5, 0, -2, 7};
            int[] expected = {-5, -2, -1, 0, 3, 4, 7};
            MergeSort.mergeSorting(arr, 0, arr.length - 1);
            assertArrayEquals(expected, arr);
        }


    }


