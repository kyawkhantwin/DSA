package com.example.dsa.stack;


import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private final  int maxSize;
    private int top;
    private final T[] stack;

    public Stack(int size) {
        maxSize = size;
        stack = (T[]) new Object[maxSize];
        top = -1;
    }
    public void push(T element){
        if (top < maxSize - 1) {
            stack[++top] = element;
        } else {
            System.out.println("Stack Overflow");
        }
    }
    public T pop() {
        if (top < 0) return null;
        T element = stack[top];
        top--;
        return element;

    }
    public T peek(){
       return stack[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public int size(){
        return top + 1;
    }
}
