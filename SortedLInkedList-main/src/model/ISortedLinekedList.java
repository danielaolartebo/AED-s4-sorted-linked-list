package model;

public interface ISortedLinekedList<E> {



    public Node<E> getHead();

    public boolean isEmpty();

    public int size();


    public void add(E e);

    public int indexOf(E e);

    public E get(int index);

    public Node<E> getNode(int index);

    public void remove(int index);

}


