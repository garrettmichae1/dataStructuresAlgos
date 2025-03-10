
package csci2010.stackdemo;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Garrett Woodside
 */
public class StackDemo {
    
   
    // LIFO last in first out 
    // stores objects in a literal stack
    //push() to add to the top 
    // pop() to take off the top 
    // peak() to view the top item in the stack
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
         Stack stack1 = new Stack();
         stack1.push("Skyrim");
         stack1.push("My boi");
         stack1.push("Stackzzz");
         System.out.println(stack1);
         System.out.println("Now popping off an object");
         stack1.pop();
         System.out.println("Now re printing stack contents");
         System.out.println(stack1);
         System.out.println("Now adding a new item to the stack");
         stack1.push("Final Fantasy");
         System.out.println("Now peaking at the stack");
         System.out.println(stack1.peek());
         System.out.println("Now emptying the stack");
         System.out.println("Now transfering the stack to an array");
         String[] stack2Array = new String[6];
          stack1.toArray(stack2Array);
          System.out.println("Now printing the array");
          System.out.println(Arrays.toString(stack2Array));
          System.out.println("Now filling element 4 and five in the array");
          stack2Array[4] = "Waddup gang";
          stack2Array[5] = "element 5 my boi";
          System.out.println(Arrays.toString(stack2Array));
          stack1.toString();
    }
}
