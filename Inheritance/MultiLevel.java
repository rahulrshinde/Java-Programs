package Inheritance;

class Person2
{
	int id;
	String name;
	
	Person2(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	void PersonData()
	{
		System.out.println("Enter Person Id: "+id);
		System.out.println("Enter Person Name: "+name);
	}
	
}

class Doctor extends Person2
{
	String Qualification;
	int Sal;
	
	Doctor(int id, String name, String Qualification, int Sal)
	{
		super(id, name);
		this.Qualification=Qualification;
		this.Sal=Sal;
	}
	
	void DoctorData()
	{
		System.out.println("Enter Qualifiaction: "+Qualification);
		System.out.println("Enter Salary: "+Sal);
	}
	
}

class Surgeon extends Doctor
{
	String Specialist;
	
	Surgeon(int id, String name, String Qualification, int Sal, String Specialist)
	{
		super(id,name,Qualification,Sal);
		this.Specialist=Specialist;
	}
	
	void SData()
	{
		System.out.println("Enter Specialist: "+Specialist);
	}
	
}


public class MultiLevel {

	public static void main(String[] args) {
		Surgeon s1 = new Surgeon(101,"Vihan","MBBS",40000,"Skin");
		s1.PersonData();
		s1.DoctorData();
		s1.SData();

	}

}
