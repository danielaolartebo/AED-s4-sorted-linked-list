package model;

public class SortedLinkedList<E> implements ISortedLinekedList<E> {

    private Node<E> head;
    private int size;

    public SortedLinkedList() {
        head = null;
        size = 0;
    }

    public Node<E> getHead() {
        return head;
    }

    public boolean isEmpty() {
        return (head == null) ? true : false;
    }

    public int size() {
        return size;
    }


    public void add(E e) {

        Node<E> node = new Node<E>(e);
        if (head == null) {
            head = node;
        } else if (head.getNext() == null) {
            System.out.println(head.toString() + "vs" + node.toString());

            if (head.compareTo(node.getItem()) <=0) {
                head.setNext(node);
                node.setPrevious(head);
                System.out.println("Entra");
            } else {
                node.setNext(head);
                head.setPrevious(node);
                head = node;

            }
        } else {

            Node<E> temp = head;
            Boolean exit = false;
            while (!exit) {
                System.out.println(temp.toString() + "vs" + node.toString());
                if (temp.compareTo(node.getItem()) <= 0) {
                    if(temp.getNext()==null){

                        exit=true;
                    }else{
                        temp = temp.getNext();
                    }
                    
                    System.out.println("Entra");
                } else {
                    exit = true;
                }

            }

            if (temp.compareTo(node.getItem()) <= 0){
                temp.setNext(node);
                node.setPrevious(temp);
            }else{

                if (temp==head){
                    node.setNext(head);
                    head.setPrevious(node);
                    head = node;
                }else{

                    temp.getPrevious().setNext(node);
                    node.setPrevious(temp.getPrevious());
        
                    node.setNext(temp);
                    temp.setPrevious(node);
                }
    
                
       
    
            }

         
          

        }

        size += 1;
    }

    public int indexOf(E e) {
        return indexOf(e, head, 0);
    }

    private int indexOf(E e, Node<E> temp, int contador) {
        if (e.equals(temp.getItem())) {
            return contador;

        } else {
            return indexOf(e, temp.getNext(), contador + 1);

        }
    }

    public E get(int index) {

        return get(index, head);

    }

    private E get(int index, Node<E> temp) {

        if (index == 0) {
            return temp.getItem();

        } else {
            return get(index - 1, temp.getNext());

        }

    }

    public Node<E> getNode(int index) {

        return getNode(index, head);

    }

    private Node<E> getNode(int index, Node<E> temp) {

        if (index == 0) {
            return temp;

        } else {
            return getNode(index - 1, temp.getNext());

        }

    }

    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();

        } else {
            getNode(index - 1).setNext(getNode(index).getNext());
        }

        size -= 1;
    }

}