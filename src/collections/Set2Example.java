package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
	
	// Create a generic list object of type Integer. 
	  List<Integer> list = new ArrayList<Integer>(); 
	  int size = list.size(); 
	 System.out.println("Size before adding elements: " +size); 
	  list.add(5); 
	  list.add(10); 
	  list.add(5); 
	  list.add(15); 
	  list.add(20); 
	  list.add(10); 
	  list.add(20); 
	  list.add(30); 
	 System.out.println("Original order of List Elements"); 
	 System.out.println(list); 
	 
	 Set<Integer> s2 = new HashSet<Integer>(list); 
	 System.out.println("Unodered List Elements after removing duplicates."); 
	 System.out.println(s2); 
}
}
