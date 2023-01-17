package Inheritance;

class Person
{
	int pid;
	String name;
	
	Person(int pid,String name)
	{
		this.pid=pid;
		this.name=name;
	}
	
	void PersonData()
	{
		System.out.println("The id of Person: "+pid);
		System.out.println("The name of Person: "+name);
	}
	
}
class Staff extends Person
{
	double sal;
	String desig;
	
	Staff(double sal,String desig,int pid, String name)
	{
		super(pid,name);
		this.sal=sal;
		this.desig=desig;
		
	}
	
	void StaffData()
	{
		System.out.println("The Salary is: "+sal);
		System.out.println("The Designation is: "+desig);
	}
	
}

public class Single1 {

	public static void main(String[] args) {
		Staff s = new Staff(25000,"Developer",101,"Rahul");
		s.PersonData();
		s.StaffData();

	}

}
//main method should loaded first in the memory as it is the entry point of the execution
//jvm without getting any object called to the main maethod bcz it is static.
