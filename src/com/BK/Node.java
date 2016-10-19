package com.BK;

public class Node<T extends Comparable> {

    protected T data;
    protected Node<T> next;

    //initialize Node
    public Node(T obj) {
        this.data = obj;
        next = null;
    }//end Node()

    //assign data and next variables
    public Node(T d, Node n) {
        data = d;
        next = n;
    }//end Node(d,n)

    //increments along the link list
    public Node<T> getLinkNext() {
        return next;
    }//end getLinkNext

    //fetches elements from the linked list
    public T getData() {
        return data;
    }//end getdata()

}//end class Node