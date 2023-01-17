package Interface;

interface Vehicle
{
	void VehicleType();
}
interface Car extends Vehicle
{
	void Speed();
}
class Maruti implements Car
{

	@Override
	public void VehicleType() {
		System.out.println("Four Wheeler");
		
	}

	@Override
	public void Speed() {
		System.out.println("80 km/h");
		
	}
	
}

public class ExtendedInterface {

	public static void main(String[] args) {
		Maruti m=new Maruti();
		m.VehicleType();
		m.Speed();
	}

}
