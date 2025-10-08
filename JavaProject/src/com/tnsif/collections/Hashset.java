package com.tnsif.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple"); 

        System.out.println("HashSet elements: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        
        System.out.println("Does HashSet contain Mango " + fruits.contains("Mango"));

       
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        
        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

       
        System.out.println("Size of HashSet: " + fruits.size());
    }
}
