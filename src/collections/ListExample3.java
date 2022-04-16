package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample3 {

	public static void main(String[] args) {
		// Create a list1 of only String type. This means that Compiler will give errors if we try to put any elements other than String type. 
		   List<String> al = new ArrayList<String>();  
		// Adding Element using reference variable al. 
		   al.add("pen"); 
		   al.add("pencil"); 
		   al.add("ink"); 
		   al.add("notebook"); 
		   al.add("book"); 
		   al.add("paper"); 
		   
		   int size=al.size();
//		   System.out.println(size);
//		   System.out.println(al.get(0));
//		   System.out.println(al.get(2));
		   //enhanced for loop
		  /* for(datatype variablename:collection or array name) {
			   statements
		   }*/
		   for(String farzana:al) {
			   System.out.println(farzana);
		   }
		   //iterator
		   Iterator<String> itr = al.iterator();
		   while (itr.hasNext()) 
		   {
		    String str = itr.next();
		    System.out.print(str + " ");
		    }
		   
		   al.remove(3);
		   al.remove("book");
		   
		   //normal loop
		   for(int i=0;i<al.size();i++) {
			   System.out.println(al.get(i));

		   }

		
	}
}
