
package csci2010.dynamicarraydemo;

import java.util.ArrayList;

/**
 * @author Garrett Woodside
 */
public class DynamicArrayDemo {
    
    //USE THE ARRAY LISTS OBJECT IT IS ALREADY CODED FOR YOU
    //Dynamic array = Array Lists in java 
    // A static array the capacity cannot be changed
    // java increases the capacity by * 1.5
    
    //dynamic arrays have random access of elements o(1)
    //easy to insert and delete elements
    
    //uses more memory than a linked list
    //expanding and shriking of the array is time consuming 

   
        
        int size;
        int capacity;
        Object[] array;
        
        public DynamicArrayDemo(){
            this.array = new Object[capacity];
        }
        
         public DynamicArrayDemo(int capacity){
           this.capacity = capacity;
           this.array = new Object[capacity];
        }
         
         public void add(Object data){
             if(size>= capacity){
                 grow();
             } 
             array[size] = data;
             size++;
         }
         public void insert(int index, Object data){
             if(size>=capacity){
                 grow();
             }
             for(int i = size; i > index; i--){
                 array[i] = array[i -1];
             }
             array[index] = data;
             size++;
         }
         
         public void delete(Object data){
             
             for(int i =0; i<size; i++){
                 if (array[i] == data){
                     for(int j = 0; j < (size - i - 1); j++){
                         array[i + j] = array[i + j + 1];
                     }
                     array[size - 1 ] = null;
                     size--;
                     if(size <= (int)(capacity/3)){
                         shrink();
                     }
                     break;
                     
                 }
             }
             
         }
         
         public int search(Object data){
             for(int i =0; i < size; i++){
                 if(array[i] == data){
                     return i;
                 }
             }
             return -1;
         }
         
         private void grow(){
             
             int newCapacity = (int)(capacity * 2);
             Object[] newArray = new Object[newCapacity];
             
             for(int i =0; i<size; i++){
                 newArray[i] = array[i];
             }
             capacity = newCapacity;
             array = newArray;
         }
         
         private void shrink(){
             
             int newCapacity = (int)(capacity / 2);
             Object[] newArray = new Object[newCapacity];
             
             for(int i =0; i<size; i++){
                 newArray[i] = array[i];
             }
             capacity = newCapacity;
             array = newArray;
             
         }
         
         public boolean isEmpty(){
             return size ==0;
         }
         
         public String toString(){
             
             String string = "";
             
             for(int i =0; i< capacity; i++){
                 string += array[i] + ", ";
             }
             if(string != ""){
             string = "[ "+ string.substring(0, string.length()-2 ) + " ]";
         }else{
                 string = "[]";
             }
             return string;
         }
        public static void main(String[] args){
        
            DynamicArrayDemo dynamicArray = new DynamicArrayDemo(5);
            
         dynamicArray.add("A");
         dynamicArray.add("B");
         dynamicArray.add("C");
          dynamicArray.add("D");
           dynamicArray.add("E");
            dynamicArray.add("F");
            
            dynamicArray.delete("A");
            dynamicArray.delete("B");
            dynamicArray.delete("C");
         
         //insert x at element 0 into the dynamic array
         dynamicArray.insert(0, "X");
         // now deleting A from the dynamic array
         dynamicArray.delete("A");
         // searching for C
            System.out.println("C is at index: " + dynamicArray.search("C"));
       
             
             System.out.println(dynamicArray);
             System.out.println("Size: " + dynamicArray.size);
             System.out.println("Capacity: " + dynamicArray.capacity);
             System.out.println("empty: " + dynamicArray.isEmpty());
       
    }
}
