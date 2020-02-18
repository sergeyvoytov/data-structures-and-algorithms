package code401challenges.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    // Creating an empty Hashtable
    //Successfully returns null for a key that does not exist in the hashtable

    @Test
    public void empty() {
        Hashtable map = new Hashtable();
        assertNull(map.get("123"));
    }

    // Adding a key/value to your hashtable results in the value being in the data structure
    //    Retrieving based on a key returns the value stored

    @Test
    public void add() {
        Hashtable map = new Hashtable();
        map.add("john", "10");
        map.add("rick", "20");
        map.add("mike", "30");
        map.add("serg", "40");

        assertEquals("10", map.get("john"));
        assertEquals("40", map.get("serg"));
    }

    @Test
    public void contains() {
        Hashtable map = new Hashtable();
        map.add("john", "10");
        map.add("rick", "20");
        map.add("mike", "30");
        map.add("serg", "40");

        System.out.println(map.get("serg"));
        assertTrue(map.contains("serg"));
        assertFalse(map.contains("mikky"));
    }
    //Successfully hash a key to an in-range value
    @Test
    public void hashTest() {
        Hashtable map = new Hashtable();

        assertEquals(4, map.hash("john"));
        assertEquals(4, map.hash("john"));
        assertEquals(2, map.hash("richard"));
    }

    @Test
    public void getTest() {
        Hashtable map = new Hashtable();
        map.add("john", "10");
        map.add("rick", "20");
        map.add("mike", "30");
        map.add("serg", "40");
        assertEquals("40", map.get("serg"));
    }
}