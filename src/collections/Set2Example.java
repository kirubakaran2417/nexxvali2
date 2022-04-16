package collections;

import java.util.HashSet;
import java.util.Set;

public class Set2Example {
public static void main(String[] args) {
	 Set<Character> s = new HashSet<Character>(); 
	  s.add('D'); 
	  s.add('F'); 
	  s.add('H'); 
	  s.add('P'); 
	  s.add('K'); 
	  s.add(null); 
	  s.add(null); // Duplicate null element. Therefore, set allow only one null element. 
	 System.out.println("Unordered Set Elements"); 
	 System.out.println(s); 
	 
	 
	// Call contains() method to search an element. 
	  boolean search = s.contains('A'); // Returns false because A is not present in the set. 
	System.out.println("Is Element A present in set: " +search); 
}
}