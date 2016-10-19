package com.BK;

import java.util.NoSuchElementException;

public class Stack<T extends Comparable> {
    private int stackSize;
    private Node<T> top;
    private T top2;
    private Node<T> currentMin;

    LinkedList list = new LinkedList();

    //initialize the Stack
    public Stack() {
        top = null;
        stackSize = 0;
    }//end stack

    //method to check if stack is empty or not
    public boolean isEmpty(){
        return top == null;
    }//end isEmpty()

    //method to keep track of stack size;
    public int size(){
        return stackSize;
    }//end size()

    //add element to stack
    public void push(T obj){
        Node oldTop = top;
        top = new Node(obj);
        top.data = obj;
        top.next = oldTop;
        stackSize++;
    }//end push()

    //remove element from stack
    public T pop() {
        if(isEmpty()) throw new NoSuchElementException("Stack underflow");
        T obj = top.data;
        top = top.next;
        stackSize--;
        return obj;
    }//end pop()

    //display the stack to the console
    public void displayStack() {
        System.out.println("Stack Data Structure: ");
        if(stackSize == 0) {
            System.out.println("empty!\n");
            return;
        }if(top.getLinkNext() == null) {
            System.out.println(top.getData());
            return;
        }
        Node ptr = top;
        System.out.println(top.getData());
        ptr = top.getLinkNext();
        while(ptr.getLinkNext() != null) {
            System.out.println(ptr.getData());
            ptr = ptr.getLinkNext();
        }
        System.out.println(ptr.getData()+"\n");
        System.out.println("Stack Size = " + size() + "\n");
    }//end displayStack()

}//end class Stack