package ClassConstuctor;

public class Call {
	static
	{
		System.out.println("I am Static block");
		
	}
	
	{
		System.out.println("I am First Anonymous block");
	}
	
	{
		System.out.println("I am Second Anonymous block");
	}
	
	Call()
	{
		System.out.println("I am Constructor");
	}

	public static void main(String[] args) 
	{
		Call c1 = new Call();
		System.out.println(" ");
		Call c2 = new Call();

	}

}
