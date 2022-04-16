package operators;

public class operators {

	public static void main(String[] args) {
		//x<<n
		
		//shifting a value to the left n bits is equivalent to multiplying that value by 2^n
		/*
		 * 
		 * 
		 * 
		 * 
		 */
		int x=20;
		//x*2^n
		//20*2^3
		//20*8
		//160
		System.out.println(x<<3);
		//shifting a value to the right n bits is equivalent to dividing that value by 2^n
		//x/2^n
		//20/2^3
		//20/8
		//2
		System.out.println(x>>3);
		System.out.println(2+2);
	}

}
