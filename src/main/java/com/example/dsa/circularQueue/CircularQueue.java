package com.example.dsa.circularQueue;

import com.example.dsa.queue.Queue;

public class CircularQueue extends Queue {

    public CircularQueue(int capacity) {
        super(capacity);
    }
    @Override
    public void enqueue(int item) {
        if (this.isFull()) throw new IllegalStateException("Queue is full");
        this.tail= this.tail % this.capacity;
        this.queueList[this.tail++] = item;
    }
    @Override
    public int dequeue(){
        if (this.isEmpty()) throw new IllegalStateException("Queue is empty");
        this.head = this.head % this.capacity;
        return queueList[this.head++];
    }
}
