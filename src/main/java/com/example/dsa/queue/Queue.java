package com.example.dsa.queue;

public class Queue {
    private int[] queueList;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.queueList = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public int dequeue(){
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
       int removed= queueList[head];
       head++;
       size--;
       return  removed;
    }
    public void enqueue(int item){
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        queueList[tail++] = item;
        size++;
    }
    public int peek(){
       return queueList[head];
    }
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size ==0 ;
    }
    public boolean isFull(){
        return size == capacity ;
    }

}
