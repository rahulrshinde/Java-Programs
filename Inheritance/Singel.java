package Inheritance;

class Base
{
	double sal1=10000;
}
class Child extends Base
{
	double sal2=15000;
}

public class Singel {

	public static void main(String[] args) {
		Child d = new Child();
		System.out.println("Salary of Base "+d.sal1);
		System.out.println("Salary of child "+d.sal2);

	}

}
