package com.BK;

import java.util.NoSuchElementException;

public class Queue<T extends Comparable> {
    private Node<T> front;
    private Node<T> rear;
    private int queueSize;

    //initialize the queue
    public Queue(){
        front = null;
        rear = null;
        queueSize = 0;
    }//end Queue

    //check to see if queue is empty
    public boolean isEmpty(){
        return front == null;
    }//end isEmpty()

    //method to keep track of queue size
    public int size() {
        return queueSize;
    }//end size()

    //method to add elements to the queue
    public void enqueue(T obj) {
        Node<T> oldLast = rear;
        rear = new Node<T>(obj);
        rear.data = obj;
        rear.next = oldLast;
        if(isEmpty()) front = rear;
        else oldLast.next = rear;
        queueSize++;
    }//end enqueue()

    //method to delete elements from the queue
    public T dequeue() {
        if(isEmpty()) throw new NoSuchElementException("Queue Underflow");
        T obj = rear.data;
        front = rear.next;
        queueSize--;
        if(isEmpty()) rear = null;
        return obj;
    }//end dequeue()

    //method to display the queue to the console
    public void displayQueue() {
        System.out.println("Queue Data Structure: ");
        if(queueSize == 0) {
            System.out.println("empty!\n");
            return;
        }if(front.getLinkNext() == null) {
            System.out.println(front.getData());
            return;
        }
        Node temp;
        System.out.println(front.getData());
        temp = front.getLinkNext();
        for(int i = 0; i < size()-1; i++) {
            System.out.println(temp.getData());
            temp = temp.getLinkNext();
        }
        System.out.println();
        System.out.println("Queue Size = " + size());
    }//end displayQueue()

}//end class Queue