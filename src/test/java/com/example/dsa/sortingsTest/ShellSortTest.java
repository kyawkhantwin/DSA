package com.example.dsa.sortingsTest;

import com.example.dsa.sort.ShellSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ShellSortTest {

    @Test
    void testShellSortWithUnsortedArray() {
        ShellSort shellSort = new ShellSort();
        int[] input = {5, 2, 9, 1, 5, 6};
        int[] expected = {1, 2, 5, 5, 6, 9};
        shellSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testShellSortWithSortedArray() {
        ShellSort shellSort = new ShellSort();
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        shellSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testShellSortWithReverseArray() {
        ShellSort shellSort = new ShellSort();
        int[] input = {9, 7, 5, 3, 1};
        int[] expected = {1, 3, 5, 7, 9};
        shellSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testShellSortWithEmptyArray() {
        ShellSort shellSort = new ShellSort();
        int[] input = {};
        int[] expected = {};
        shellSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testShellSortWithSingleElement() {
        ShellSort shellSort = new ShellSort();
        int[] input = {42};
        int[] expected = {42};
        shellSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testShellSortWithDuplicates() {
        ShellSort shellSort = new ShellSort();
        int[] input = {4, 2, 2, 8, 3, 3, 1};
        int[] expected = {1, 2, 2, 3, 3, 4, 8};
        shellSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testShellSortWithNegativeNumbers() {
        ShellSort shellSort = new ShellSort();
        int[] input = {-3, -1, -7, -5, 0, 2};
        int[] expected = {-7, -5, -3, -1, 0, 2};
        shellSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testShellSortWithMixedNumbers() {
        ShellSort shellSort = new ShellSort();
        int[] input = {0, -1, 3, -5, 8, 2, -2};
        int[] expected = {-5, -2, -1, 0, 2, 3, 8};
        shellSort.sort(input);
        assertArrayEquals(expected, input);
    }
}
