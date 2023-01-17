package Interface;

class person
{
	int id;
	String name;
	
	person(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}
	
	void PersonData() {
		System.out.println("Person id: "+id);
		System.out.println("Person Name: "+name);
	}
}

class manager extends person implements employee
{
	int sal,exp;

	manager(int id, String name, int sal, int exp) {
		super(id, name);
		this.sal = sal;
		this.exp = exp;
	}
	
	void managerData()
	{
		System.out.println("Manager salary "+sal);
		System.out.println("Manager experiance "+exp);
	}

	@Override
	public void pfData() {
		// TODO Auto-generated method stub
		System.out.println("pf is 1000");
		
	}
	
}

interface employee
{
	void pfData();
}

public class MainInterface {

	public static void main(String[] args) {
		manager m=new manager(101,"Rahul",25000,2);
		m.PersonData();
		m.managerData();
		m.pfData();

	}

}
