package ui;

import model.*;
public class Main {

    
    public static void main(String[] args) {

       Person test1=new Person("Daniel", "1006107372", 2);
       Person test2=new Person("Daniela", "5475474745", 19);
       Person test3=new Person("Esteban", "5447457457", 18);
       Person test4=new Person("Jacobo", "124107372", 18);
       Person test5=new Person("Alex", "547999898", 19);
       Person test6=new Person("Camilo", "1107123372", 1);

       System.out.println(test4.compareTo(test5));


       SortedLinkedList<Person> list=new SortedLinkedList<>();

       list.add(test1);
       list.add(test2);
       list.add(test3);
       list.add(test4);
       list.add(test5);
       list.add(test6);
  

       toString(list);

    }

    public static void toString(SortedLinkedList<Person> list) {
        System.out.println("LISTA:");
        for (int i = 0; i < list.size(); i++) {
            
            System.out.println(list.get(i));
        }
        System.out.println("-----------------------------------------");
        
    }

    

    
}

