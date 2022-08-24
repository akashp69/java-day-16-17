package com.assigments.algorithms.datastructure;


public class Node<T> {

    private T key;
    public Node(T key) {
        this.key = key;
        this.next = null;
    }

    private Node<T> next;
    public T getKey() {
        return key;
    }
    public void setKey(T key) {
        this.key = key;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }

}