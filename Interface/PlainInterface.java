package Interface;

interface Animal
{
	void AnimalType();
	void breed();
}

class Dog implements Animal
{

	@Override
	public void AnimalType() 
	{
		System.out.println("Domestic Animal");
		
	}

	@Override
	public void breed() 
	{
		System.out.println("Bull dog");
		
	}
}

public class PlainInterface {

	public static void main(String[] args) 
	{
		Dog d = new Dog();
		d.AnimalType();
		d.breed();

	}

}
