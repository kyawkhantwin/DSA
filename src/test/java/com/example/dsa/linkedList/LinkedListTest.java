package com.example.dsa.linkedList;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {

    @Test
    public void linkedListBaseCase(){
        LinkedList linkedList = new LinkedList();

        linkedList.push(2);
        linkedList.push(3);
        assertEquals(3, linkedList.getLatestValue());
    }
    @Test
    public void linkedListLength(){
        LinkedList linkedList = new LinkedList();

        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        linkedList.push(5);
        linkedList.push(6);
        assertEquals(6, linkedList.length());
    }

    @Test
    public void linkedListValues(){
        LinkedList linkedList = new LinkedList();

        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        linkedList.push(5);
        linkedList.push(6);

        assertEquals(List.of(6, 5, 4, 3, 2, 1), linkedList.getValues());
    }
    @Test
    public void linkedListNthValue(){
        LinkedList linkedList = new LinkedList();

        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        linkedList.push(5);
        linkedList.push(6);


        assertEquals(6, linkedList.nthNode(1));
        assertEquals(5, linkedList.nthNode(2));
        assertEquals(4, linkedList.nthNode(3));
        assertEquals(3, linkedList.nthNode(4));
        assertEquals(2, linkedList.nthNode(5));
        assertEquals(1, linkedList.nthNode(6));
    }

    @Test
    public void linkedListRemoveTest(){
        LinkedList linkedList = new LinkedList();

        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        linkedList.push(5);
        linkedList.push(6);

        assertEquals(1, linkedList.remove(1));
        assertEquals(2, linkedList.remove(2));
        assertEquals(3, linkedList.remove(3));

//        assertEquals(6, linkedList.nthNode(1));
//        assertEquals(5, linkedList.nthNode(2));
//        assertEquals(4, linkedList.nthNode(3));
//        assertEquals(3, linkedList.nthNode(4));
//        assertEquals(2, linkedList.nthNode(5));
//        assertEquals(1, linkedList.nthNode(6));
    }



}
