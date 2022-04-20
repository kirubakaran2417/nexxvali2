package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set3Example {
/*
 *  Using Iterator
    Using Enhanced for loop
    Using forEach()
 */
	public static void main(String[] args) {
		// Create a generic set object of type String. 
		   Set<String> s = new HashSet<String>(); // s.size() is 0.
		   int size = s.size(); 
		  System.out.println("Size before adding elements: " +size); 
		  
		// Adding elements to set. 
		   s.add("Orange"); // s.size() is 1.
		   s.add("Red"); // s.size() is 2.
		   s.add("Blue"); // s.size() is 3.
		   s.add("Yellow"); // s.size() is 4.
		   s.add("Green"); // s.size() is 5.
		System.out.println("Elements in set"); 
		System.out.println(s); 
		
		Iterator<String> itr = s.iterator(); 
		System.out.println("Iteration using Iterator method"); 
		while(itr.hasNext())
		{ 
		  Object str = itr.next(); 
		  System.out.println(str); 
		 } 
		
		System.out.println("Iteration Using Enchanced For Loop"); 
		 for(String it:s)
		 { 
		   System.out.println(it); 
		  } 
	}
}
