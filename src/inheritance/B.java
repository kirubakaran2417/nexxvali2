package inheritance;

public class B extends A{
	
	public void display() {
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		B b=new B();
		b.display();
	}
}
