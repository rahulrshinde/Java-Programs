package basic;

public class Arithmatic {

	public static void main(String[] args) {
		int a = 10, b = 37, c;
		
		c = a + b;
		System.out.println("Addition "+c);
		
		c = a - b;
		System.out.println("Subtraction "+c);
		
		c = a * b;
		System.out.println("Multiply "+c);
		
		c = a / b;
		System.out.println("Division "+c);
		
		c = a % b;
		System.out.println("Mod "+c);
		
		c = ++a;
		System.out.println("Pre Increment "+c);
		
		c = a++;
		c = a;
		System.out.println("Post Increment "+c);
		
		c = --b;
		System.out.println("Pre Decrement "+c);
		
		c = b--;
		c = b;
		System.out.println("Post Decrement "+c);

	}

}
