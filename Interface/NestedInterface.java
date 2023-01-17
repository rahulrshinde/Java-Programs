package Interface;

interface vehicle1
{
	void VehicleType();
	interface car
	{
		void speed();
	}
	interface bike
	{
		void price();
	}
	
}

class Maruti1 implements vehicle1,vehicle1.car,vehicle1.bike
{

	@Override
	public void price() {
		System.out.println("120000");
		
	}

	@Override
	public void speed() {
		System.out.println("80 km/h");
		
	}

	@Override
	public void VehicleType() {
		System.out.println("Both");
		
	}
	
}

public class NestedInterface {

	public static void main(String[] args) {
		Maruti1 m = new Maruti1();
		m.VehicleType();
		m.speed();
		m.price();

	}

}
