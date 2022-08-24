package com.assigments.algorithms.datastructure;

public class LinkedList<T> {

    Node<T> head;
    Node<T> tail;

    public void add(T key) {
        Node<T> newNode = new Node(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    public void push(T key) {
        Node<T> newNode = new Node(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    public boolean search(T searchkey) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.getKey() == searchkey)
                return true;
            temp = (Node<T>) temp.getNext();
        }
        return false;
    }

    public void show() {
        if (head == null) {
            System.out.println("Linked list is Empty");
        } else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.println(temp.getKey() + " ");
                temp = (Node<T>) temp.getNext();
            }
            System.out.println();
        }
    }
    public T pop() {
        if (head == null)
            return null;
        else {
            T key = head.getKey();
            head = (Node<T>) head.getNext();
            return key;
        }
    }
    public int getSize() {
        if (head == null)
            return 0;
        else {
            Node<T> temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.getNext();
            }
            return count;
        }
    }
    public T popLast() {
        if (head == null) {
            System.out.println("Stack is empty");
            System.out.println(head.getKey());
            head = null;
        }
        Node<T> temp = head;
        while (temp.getNext() != tail) {
            temp = temp.getNext();
        }
        T key = tail.getKey();
        temp.setNext(null);
        tail = temp;
        return key;
    }
    public void removeItem(T item)
    {
        Node<T> current=head;
        Node<T> prev=null;
        if(head==null)
        {
            System.out.println("List is empty..!!");
            return;
        }
        if(head.getKey().equals(item))
        {
            head = head.getNext();
        }
        else
        {
            while(current.getNext()!=null)
            {
                if(current.getKey().equals(item))
                {
                    System.out.println("Removed : "+current.getKey());
                    prev.setNext(current.getNext());
                    return;
                }
                prev=current;
                current=current.getNext();
            }
        }
    }
    public void remove(int index){
        int size= getSize();
        if(head == null)
            System.out.println("List is Empty.");
        else if(index < 1 || index > size)
            System.out.println("invalid index");
        else if(index == 1)
            pop();
        else if(index == size)
            popLast();
        else
        {
            Node<T> temp, temp1;
            temp = head;
            for(int i = 1; i < index -1; i++)
            {
                temp = temp.getNext();
            }
            temp1 = temp.getNext();
            temp.setNext(temp1.getNext());
            size--;
        }
    }

}