package com.example.dsa.stack;


import java.util.ArrayList;
import java.util.List;

public class Stack {
    private int maxSize;
    private int top;
   private  int[] stack;

    public Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }
    public void push(int  element){
        if (top < maxSize - 1) {
            stack[++top] = element;
            System.out.println("Pushed " + element);
        } else {
            System.out.println("Stack Overflow");
        }
    }
    public int pop() {
        if (top >= 0) {
            int element = stack[top];
            stack[top--] = 0;
            System.out.println("Popped " + element);
            return element;
        } else {
            System.out.println("Stack Underflow");
            return -1;  // Stack is empty
        }
    }
    public int peek(){
       return stack[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public int size(){
        return top + 1;
    }
}
