package Encapsulation;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setId(101);
		p1.setName("Rahul");
		p1.setLoc("Badlapur");
		
		System.out.println(p1);
		
		/*System.out.println("Person ID is: "+p1.getId());
		System.out.println("Person Name is "+p1.getName());
		System.out.println("Person Location is "+p1.getLoc());*/

	}

}
