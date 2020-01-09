package code401challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BinarySearchTest {

    @Test
    public void testBinarySearchMethod() {

        int[] array = {10, 20, 30, 40, 50};
        int value = 10;
        assertEquals("testbinarysearch should return 'true'", 0, BinarySearch.binarySearch(array, value));
    }
}