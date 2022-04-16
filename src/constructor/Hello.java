package constructor;

public class Hello {

	String name;
	
	Hello(){
		name="paul";
	}
	Hello(int a){
		
	}
	public static void main(String[] args) {
		Hello h=new Hello();
		System.out.println(h.name);
	}
	
	/*
	 * Types of constructor
	 * default constuctor
	 * parameterized constructor
	 */
}
