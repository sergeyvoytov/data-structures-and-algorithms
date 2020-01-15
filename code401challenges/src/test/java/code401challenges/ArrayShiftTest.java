package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void testArrayShift1() {
        int[] arrayToTest = {10, 22, 32, 42};
        assertEquals(arrayToTest.length + 1, ArrayShift.insertShiftArray(arrayToTest, 5).length);
    }

    @Test
    public void testArrayShift2() {
        int[] array1 = {10, 22, 33, 46};
        int[] arrayToCompare = {10, 22, 17, 33, 46};
        int value = 17;
        assertArrayEquals(arrayToCompare, ArrayShift.insertShiftArray(array1, value));
    }
}
