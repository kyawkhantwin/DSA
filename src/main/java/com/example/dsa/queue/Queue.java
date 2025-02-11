package com.example.dsa.queue;

public class Queue {
    protected final int[] queueList;
    protected int head;
    protected int tail;
    protected final int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.queueList = new int[capacity];
        this.head = 0;
        this.tail = 0;
    }

    public int dequeue(){
        if (this.isEmpty()) throw new IllegalStateException("Queue is empty");
       return  queueList[head++];
    }
    public void enqueue(int item){
        if (this.isFull()) throw new IllegalStateException("Queue is full");
        queueList[tail++] = item;
    }
    public int peek(){
       return queueList[head];
    }
    public int size(){
        return this.tail - this.head;
    }
    public boolean isEmpty(){
        return this.size() ==0 ;
    }
    public boolean isFull(){
        return this.size() == capacity ;
    }

}
