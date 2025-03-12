package csci2010.hashtabledemo;

import java.util.Hashtable;

/**
 *
 * @author Garrett Woodside
 */

//Hash table - is a data structure that stores unique keys to values ex. <Integer><String>
// each key / value pair is known as an entry 
// Fast insertion look up, deletion of key / value pairs 
// not ideal for small data sets, great for large data sets.

//hashing- takes a key and computes an integer ( formula will vary basaed in key and 
// data type ---- in a hashtable, we use the hash % capacity to calculate index number

// key.hashCode() % capacity = index

//bucket = an index storage location for one or more entries.

//collision = hash function generates the same index for more than one key

//runtime complexity = best case: O(1),  worst case: O(n)
public class HashTableDemo {

    public static void main(String[] args) {

        Hashtable<String, String> table = new Hashtable<>(21);

        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sande");
        table.put("555", "Squidward");
        table.put("777", "Gary");
        
        //table.remove(777);
        
        for(String key : table.keySet()){
            System.out.println( key.hashCode() % 11 + "\t"+ key + "\t" + table.get(key));
        }
        
        

    }
}
