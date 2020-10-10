package muntu2;

import java.util.*;

class hashTablePemba {
    public static void main(String[] arg) {
        // creating a hash table: Original table
        Hashtable<Integer, String> father = new Hashtable<Integer, String>();
        father.put(3, " - Nikolas");
        father.put(2, " - LorenaN");
        father.put(1, " - Leon Nc");
        father.put(41, " - Marvin");

        System.out.println("\n Parent source after clearing of father: \n" + father);
        // create a clone or shallow copy of hash table father
        Hashtable<?, ?> elderSon;
        elderSon = (Hashtable<?, ?>) father.clone();

        System.out.println("\n Children in class of clone: \n" + elderSon);
        // Removing the original hashtable
        father.clear();
        // Proving if the clearing was successful
        System.out.println("\n Parent source after clearing of father: \n" + father);
        System.out.println("\n Children in class of clone: \n" + elderSon);
    }
}