package Constructor;

import java.util.Scanner;

public class Rectangle {
	
	int a,l,w,p;
	
	public void area() {
		System.out.println("Enter Length of area: ");
		Scanner sc = new Scanner(System.in);
		l = sc.nextInt();
		
		System.out.println("Enter Width of area: ");
		w = sc.nextInt();
		
		a = l*w;
		System.out.println("Area of Rectangle is: "+a);
	}

	public void perimeter() {
		System.out.println("Enter Length of Perimeter: ");
		Scanner sc = new Scanner(System.in);
		l = sc.nextInt();
		
		System.out.println("Enter Width of Perimeter: ");
		w = sc.nextInt();
		
		p = 2*l + 2*w;
		System.out.println("Perimeter of Rectangle is: "+p);
		
	}
	
	public static void main(String args[]) {
		Rectangle rect = new Rectangle();
		rect.area();
		//rect.perimeter();
	}
	
}
