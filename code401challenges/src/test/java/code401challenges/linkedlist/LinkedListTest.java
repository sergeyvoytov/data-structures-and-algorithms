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
        assertFalse(list.includes(19));

    }

    //testing append
    @Test
    public void testAppend() {
        LinkedList list = new LinkedList();
        list.insert(12);
        list.insert(15);
        list.insert(17);
        list.append(234);
        String expected = "17, 15, 12, 234";
        assertEquals(expected, (list.toString()));

    }

    //Insert in the middle after the specified value
    @Test
    public void testInsertAfter() {
        LinkedList list = new LinkedList();
        list.insert(80);
        list.insert(90);
        list.insert(100);
        list.insert(110);
        list.insert(120);
        list.insertAfter(100, 234);
//        System.out.println(list.toString());
        String expected = "120, 110, 100, 234, 90, 80";
        assertEquals(expected, (list.toString()));

    }

    //Insert in the end of the list
    @Test
    public void testInsertAfter2() {
        LinkedList list = new LinkedList();
        list.insert(80);
        list.insert(90);
        list.insert(100);
        list.insert(110);
        list.insert(120);
        list.insertAfter(80, 999);
//        System.out.println(list.toString());
        String expected = "120, 110, 100, 90, 80, 999";
        assertEquals(expected, (list.toString()));

    }

    //Insert in the middle of the list
    @Test
    public void testInsertBefore1() {
        LinkedList list = new LinkedList();
        list.insert(80);
        list.insert(90);
        list.insert(100);
        list.insert(110);
        list.insert(120);
        list.insertBefore(100, 234);
//        System.out.println(list.toString());
        String expected = "120, 110, 234, 100, 90, 80";
        assertEquals(expected, (list.toString()));

    }

    //Insert in the beginning of the list
    @Test
    public void testInsertBefore2() {
        LinkedList list = new LinkedList();
        list.insert(80);
        list.insert(90);
        list.insert(100);
        list.insert(110);
        list.insert(120);
        list.insertBefore(120, 234);
//        System.out.println(list.toString());
        String expected = "234, 120, 110, 100, 90, 80";
        assertEquals(expected, (list.toString()));

    }


    @Test
    public void testGetK() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);

        assertEquals(30, list.getK(2));
        assertEquals(60, list.getK(5));
        assertEquals(10, list.getK(0));
//        assertEquals(-1, list.getK(57));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetKwithExemption() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);

        list.getK(57);
    }
}