package ClassConstuctor;

class Stud{
	int id;
	String name;
	static String institute = "Squad";
	
	Stud(int id,String name){
		this.id=id;
		this.name=name;
	}
}

public class Student {

	public static void main(String[] args) {
		Stud s1 = new Stud(101,"Rahul");
		Stud s2 = new Stud(102,"Mandar");
		System.out.println("First Student");
		System.out.println("Student Id: "+s1.id);
		System.out.println("Student Name: "+s1.name);
		System.out.println("Student Institute: "+s1.institute);
		System.out.println(" ");
		System.out.println("Second Student");
		System.out.println("Student Id: "+s2.id);
		System.out.println("Student Name: "+s2.name);
		System.out.println("Student Institute: "+s2.institute);
		System.out.println(" ");

	}

}
