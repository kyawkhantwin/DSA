package com.example.dsa.linkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LinkedList {
    private Node head;

    public void push(int input) {
        Node newNode = new Node(input);
        newNode.next = head;  // newNode.next to the previous node
        head = newNode;       // Set new node as the head
    }

    public int getLatestValue() {
        if (head != null) {
            return head.data;
        }
        throw new IllegalStateException("List is empty");
    }

    public int length() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public List<Integer> getValues() {
        List<Integer> result = new ArrayList<>();
        Node current = head;
        while (current != null) {
            result.add(current.data);
            current = current.next;
        }
        return result;
    }

    public Optional<Integer> nthNode(int index) {
        if (index < 1) {
            throw new IllegalArgumentException("Index must be positive");
        }
        Node current = head;
        int count = 1;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
        return current != null ? Optional.of(current.data) : Optional.empty();
    }

    public int remove(int key) {
        Node current = head;

        if (current != null && current.data == key) {
            head = current.next;
            return current.data;
        }

        while (current != null && current.next != null) {
            if (current.next.data == key) {
                Node toRemove = current.next;
                current.next = current.next.next;
                return toRemove.data;
            }
            current = current.next;
        }

        return -1;
    }

    private static class Node {
        int data;
        Node next;

        // Constructor to initialize a new node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
