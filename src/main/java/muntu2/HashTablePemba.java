package muntu2;
import java.util.*;
class hashTablePemba { 
    public static void main(String[] arg) 
    { 
        // creating a hash table 
        Hashtable<Integer, String> father = new Hashtable<Integer, String>(); 
        Hashtable<Integer, String> son1 = new Hashtable<Integer, String>(); 
        father.put(3, " - Nikolas"); 
        father.put(2, " - LorenaN"); 
        father.put(1, " - Leon Nc"); 
        // Clone the created hashtable
        son1 = (Hashtable<Integer, String>) father.clone(); 
         
        // Proving is clone was successful 
        System.out.println("Children in class of clone: " + son1); 
        // Removing the original hashtable h 
        father.clear(); 
        // Proving if the clearing was successful
        System.out.println("Parent source after clearing of father: " + father); 
    } 
}