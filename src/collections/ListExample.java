package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// Here, there is no use of generic. So, no type safety. We can add both integer and string elements. 
		List al=new ArrayList();
		// Adding elements using add() method with reference variable al.
		 al.add(10);//0 
		 al.add(20); //1
		 al.add(30); //2
		 al.add(40);//3
		 al.add(true);//6
		 
		// Adding element to 4th position. 
		 al.add(4, 35); //4
		// Adding element to 5th position. 
		 al.add(5, 45); //5
		 //replacing the element which is in index 2
		 al.set(2, 35);
		  System.out.println("Elements after adding: " +al); 
		
		
	}
}
