package code401challenges.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSort() {

        int[] example = {8,4,23,42,16,15};
        int[] array = {13, 24, 23, 49, 5, 17, 1};

        int[] exampleSorted = {4,8,15,16,23,42};
        int[] arraySorted = {1,5,13,17,23,24,49};

        assertArrayEquals(arraySorted, MergeSort.mergeSort(array));
        assertArrayEquals(exampleSorted, MergeSort.mergeSort(example));

    }
}