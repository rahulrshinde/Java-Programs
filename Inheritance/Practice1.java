package Inheritance;

	class Person1
	{
		int id;
		
		Person1(int id)
		{
			this.id=id;
		}
		
		void PersonData()
		{
			System.out.println("Person Id is: "+id);
		}
	}
	
	class Staff1 extends Person1
	{
		String name;
		
		Staff1(int id, String name)
		{
			super(id);
			this.name=name;
		}
		
		void StaffData()
		{
			System.out.println("Staff Name is: "+name);
		}
	}
		
public class Practice1 
{
	
	public static void main(String[] args) 
	{
		Staff1 s1 = new Staff1(101, "Kanchan");
		s1.PersonData();
		s1.StaffData();
	}
}
