package model;



public class Node<E> implements Comparable<E>{

    private E item;
    private Node<E> next;
    private Node<E> previous;


    public Node(E element) {
        this.item = element;
        this.next = null;
        this.previous=null;

    }




    public Node<E> getPrevious() {
        return this.previous;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }



    public void setItem(E item) {
        this.item = item;
    }


    public E getItem() {
        return item;
    }


    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }



    @Override
    public int compareTo(E o) {
        return ((Comparable<E>) getItem()).compareTo(o);
    }




    @Override
    public String toString() {
        return "{"+getItem();
    }




}
