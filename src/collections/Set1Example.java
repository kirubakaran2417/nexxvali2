package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set1Example {

	public static void main(String[] args) {
		// Create a generic set object of type String. 
		   Set<String> s = new HashSet<String>(); 
		   
		   int size = s.size(); 
		   System.out.println("Size before adding elements: " +size); 
		   
		// Adding elements to set. 
		   s.add("Orange"); // s.size()is 1.
		   s.add("Red"); // s.size() is 2.
		   s.add("Blue"); // s.size() is 3.
		   s.add("Yellow"); // s.size() is 4.
		   s.add("Green"); // Now s.size() is 5.
		   
		   System.out.println(s);
		   
		   System.out.println("Size before adding elements: " +s.size()); 
		   
		// Add duplicate elements in the set. These elements will be ignored by set due to not taking duplicate elements. 
		   s.add("Red"); // s.size() is still 5 because we cannot add duplicate element.
		   s.add("Blue"); // s.size() is still 5 because we cannot add duplicate element.
		  System.out.println("Unordered Set Elements"); 
		  System.out.println(s); 
		  
		  // Check 'Black' element is present in the above set or not. 
		   if(s.equals("Black"))
		   { 
		     System.out.println("Black element is not present in set."); 
		   } 
		  else 
		  { 
		    s.add("Black"); 
		    System.out.println("Black is added successfully."); 
		    System.out.println("Set Elements after adding black element"); 
		    System.out.println(s); 
		   } 
		   
		// Create another set object to add collection of elements to the above set. 
		   Set<String> s2 = new LinkedHashSet<String>(); 
		    s2.add("White"); 
		    s2.add("Brown"); 
		    s2.add("Red"); // Duplicate element.
		    
		    s.addAll(s2);
		    
		    System.out.println(s);
		    
		 // Remove an element from set. 
		    s.remove("Blue"); 
		    System.out.println("Set elements after removing"); 
		    System.out.println(s); 

	}

}
