

package csci2010.queuedemo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Garrett Woodside
 */
public class QueueDemo {
    
    //First in first out data structure 
    // just like a line of people at a cashier
    // collection designed for holding elements prior to precessing 
    // linear data structure 
    
    //add = enqueue, offer()
    // remove = dequeue, poll()
    //must use linked list in conjuction with queue because 
    // queue is an interface

    public static void main(String[] args) {
        
        Queue <String> queue = new LinkedList<String>();
        queue.offer("KAren");
        queue.offer("chad");
        queue.offer("steve");
        System.out.println("Peaking at the queue");
        System.out.println(queue.peek());
        
        queue.poll();
        queue.poll();
        System.out.println("Peaking after polling twice");
        System.out.println(queue.peek());
        System.out.println("Is the queue empty?");
        System.out.println(queue.isEmpty());
        System.out.println("What is the size of the queue");
        System.out.println(queue.size());
        System.out.println("Does the queue contain jake?");
        System.out.println(queue.contains("jake"));
       
       
    }
}
