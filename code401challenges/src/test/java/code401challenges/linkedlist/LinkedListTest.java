package code401challenges.linkedlist;

import code401challenges.Library;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    //successfully instantiate an empty linked list
    @Test
    public void testEmptyCreated() {
        LinkedList list = new LinkedList();
        assertNull(list.head);
    }

    //successfully insert values
    @Test
    public void testInsert() {
        LinkedList list = new LinkedList();
        list.insert(12);

        assertEquals(12, list.head.value);
    }

    //Can properly return a collection of all the values that exist in the linked list
    @Test

    public void testLinkListMethod() {
        LinkedList list = new LinkedList();
        list.insert(12);
        list.insert(22);
        list.insert(33);

        String expected = "33, 22, 12";

        assertEquals("Values with coma and space in between", expected, (list.toString()));

//        System.out.println((list.toString()));
    }


    //successfully verified includes return true
    @Test
    public void testIncludesTrue() {
        LinkedList list = new LinkedList();
        list.insert(12);
        list.insert(15);
        list.insert(17);
//        System.out.println(list.toString());
        assertTrue(list.includes(12));

    }

//test to see if return false
    @Test
    public void testIncludesFalse() {
        LinkedList list = new LinkedList();
        list.insert(12);
        list.insert(15);
        list.insert(17);
//        System.out.println(list.toString());
        assertFalse( list.includes(19));

    }

}