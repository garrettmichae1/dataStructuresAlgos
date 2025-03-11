package csci2010.bubblesortdemo;

    // bubble sort = pairs of adjacent elements are compared, 
    // and the elements are swapped if they are not in order.
    
    // quadratic time 0(n^2)
    // small data set it's okay
    // big data set , it's bad


/**
 * @author Garrett Woodside
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] array = {9, 4, 3, 2, 5, 6, 8, 4};
        bubbleSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {  // Fix here (j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
