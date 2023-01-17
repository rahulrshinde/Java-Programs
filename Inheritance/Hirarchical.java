package Inheritance;

class TraningInstitute
{
	static String name="Squad";
	String Teacher;
	float Time;
	
	TraningInstitute(String Teacher,float Time)
	{
		this.Teacher=Teacher;
		this.Time=Time;
	}
	
	void Display()
	{
		System.out.println("Training Institute Name: "+name);
		System.out.println("Teacher Name: "+Teacher);
		System.out.println("Lecture Timinig: "+Time+" PM");
	}
	
}

class Branch1 extends TraningInstitute
{
	String Loc,Courses;
	
	Branch1(String Teacher,float Time, String Loc, String Courses)
	{
		super(Teacher,Time);
		this.Loc=Loc;
		this.Courses=Courses;
	}
	
	void Display1()
	{
		System.out.println("Institute Location: "+Loc);
		System.out.println("Course Name: "+Courses);
	}
	
}

class Branch2 extends TraningInstitute
{
	String Loc2,Courses2;
	
	Branch2(String Teacher,float Time, String Loc2, String Courses2)
	{
		super(Teacher,Time);
		this.Loc2=Loc2;
		this.Courses2=Courses2;
	}
	
	void Display2()
	{
		System.out.println("Institute Location: "+Loc2);
		System.out.println("Course Name: "+Courses2);
	}
	
}

public class Hirarchical {

	public static void main(String[] args) {
		Branch1 i1 = new Branch1("Sameena Mam",3,"Vashi","Java");
		Branch2 i2 = new Branch2("Devendra Sir",5,"Thane","Python");
		Branch1 i3 = new Branch1("Sameena Mam",5,"Thane","Java");
		System.out.println("First Branch");
		i1.Display();
		i1.Display1();
		System.out.println(" ");
		i3.Display();
		i3.Display1();
		System.out.println(" ");
		System.out.println("Second Branch");
		i2.Display();
		i2.Display2();

	}

}
