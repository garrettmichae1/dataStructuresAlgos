package csci2010.linearsearchdemo;

/**
 * @author Garrett Woodside
 */

//linear search = iterate through a collection one element at a time

// runtime complexity: o(n)

//Disadvantages : slow for large data sets

//Advantages: fast for searching medium data sets
// does not need to be sorted 
// useful for data structures that do not have random access (linked list)

public class LinearSearchDemo {

    public static void main(String[] args) {
        int[] array = {4,3,5,6,3,4,5,2,6};
        
        int index = LinearSearch(array, 5);   
    
        if(index != -1){
            System.out.println("Element found at  index: " + index);
        }else{
            System.out.println("Element not found");
        }
    }
    
    private static int LinearSearch(int[] array, int value){
       
        for(int i =0; i < array.length; i++ ){
            if(array[i] == value){
                return i;
            }
        }
        
        return -1;
    }
}
