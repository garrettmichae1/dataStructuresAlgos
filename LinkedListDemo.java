package csci2010.linkedlistdemo;

import java.util.LinkedList;

/**
 * @author Garrett Woodside
 */
public class LinkedListDemo {

    //where arrays have trouble inserting and deleting linked lists have an advantage
    // made up with nodes with 2 parts ( the data , and the address for the next node )
    // think of a ( scavenger hunt ) end of list has an address of null
    // easy deletion, bad at searching
    // ( such things as doubly linked lists , has 2 pointer addresses )
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        /**
         *  // used as a stack 
         * linkedList.push("A"); 
         * linkedList.push("B");
         * linkedList.push("C"); 
         * linkedList.push("D"); 
         * linkedList.push("F");
         * linkedList.pop();
         */
        
        //used as a queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
       // linkedList.poll();
       
       // adding a node to the linked list
       linkedList.add(4, "E");
       //remove element
       linkedList.remove("E");
       // search for index of an item
        System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList);
        
        //peek at first element
        System.out.println(linkedList.peekFirst());
        // peek at last element
        System.out.println(linkedList.peekLast());
        // add an element to the beginning and end
        linkedList.addFirst("0");
        linkedList.addLast("Z");
        // you can also remove items using remove.first/last
        System.out.println(linkedList);
        

    }
}
