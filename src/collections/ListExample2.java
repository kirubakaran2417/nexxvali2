package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		// Create a list1 of only String type. This means that Compiler will give errors if we try to put any elements other than String type. 
		   List<String> al = new ArrayList<String>();  
		   al.add("Apple"); 
		   al.add("Mango"); 
		   al.add("Orange"); 
		   al.add("Grapes"); 
		   
		   System.out.println(al);
		   
		   List<String> al2 = new ArrayList<String>();  
		   
		   al2.add("11");
		   al2.add("12");
		   al2.add("13");
		   
		   System.out.println("List2 contain :-"+al2);
		   
		   al.addAll(2, al2);
		   
		   System.out.println(al);

		
	}
}
