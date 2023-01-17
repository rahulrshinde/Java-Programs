package basic;

import java.util.Scanner;

public class DoWhileSquareRoot {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter The Number: ");
			a = sc.nextInt();
			System.out.println("Square Root is: "+a*a);
		} while(a>0); //this condition is true so, loop not stop.

	}

}
