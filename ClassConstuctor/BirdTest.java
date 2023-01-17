package ClassConstuctor;

class Bird{
	String name;
	String color;
	
	Bird(String name, String color){
		this.name=name;
		this.color=color;
	}
	
}

public class BirdTest {

	public static void main(String[] args) {
		Bird b1 = new Bird("Parrot","Green");
		System.out.println("First Bird Name is: "+b1.name);
		System.out.println("First Bird color is: "+b1.color);
		
		Bird b2 = new Bird("Crow","Black");
		System.out.println("Second Bird Name is: "+b2.name);
		System.out.println("Second Bird color is: "+b2.color);

	}

}
