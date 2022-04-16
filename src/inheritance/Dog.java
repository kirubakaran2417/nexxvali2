package inheritance;

public class Dog extends Animal {
	
	public void display() {
		System.out.println("My name is: "+name);
	}
	
	public void eat() {
		super.ir=35;
		System.out.println(ir);
		System.out.println("i eat pedigree");
	}
	public static void main(String[] args) {
		Dog shitzu=new Dog();
		shitzu.name="spider";
		shitzu.display();
		shitzu.eat();
		
	}
}
