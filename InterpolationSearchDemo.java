package csci2010.interpolationsearchdemo;

/**
 * @author Garrett Woodside
 */
public class InterpolationSearchDemo {

    //interpolation search = improvement over binary search used for "unifomrly distributed data"
    // data that goes up or down in one direction e.g. 2,4,5,6,7,8
    // guesses where a value might be based on calculated probe results 
    // if probe is incorrect, search area is narrowed, and a new probe is calculated
    
    //average case O(log(log (n)))
    // worst case : O(n) [values increase exponentially]
    
    
    public static void main(String[] args) {
        
        
     //   int[] array = {1, 2, 3, 4, 5 , 6, 7, 8, 9};
        
       int[] array = {1,2,4,8,16,32,64,128,256,512, 1024}; 
        
       int index = interpolationSearch(array, 256);
      
      
        
        if(index != -1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
        
    }
    private static int interpolationSearch(int[] array, int value) {
    int high = array.length - 1;
    int low = 0;

    while (value >= array[low] && value <= array[high] && low <= high) {
        if (array[high] == array[low]) { // Prevent division by zero
            if (array[low] == value) {
                return low;
            } else {
                return -1;
            }
        }

        int probe = low + ((high - low) * (value - array[low])) / (array[high] - array[low]);

        // Ensure probe is within bounds
        if (probe < low || probe > high) {
            break;
        }

        System.out.println("Probe: " + probe);

        if (array[probe] == value) {
            return probe;
        } else if (array[probe] < value) {
            low = probe + 1;
        } else {
            high = probe - 1;
        }
    }

    return -1;
}

}
