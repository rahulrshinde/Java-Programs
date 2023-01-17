package basic;

import java.util.Scanner;

public class Attendence {

	public static void main(String[] args) {
		float held,attend,percent;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("No of classes held: ");
		held = sc.nextInt();
		
		System.out.println("No of classes attendence: ");
		attend = sc.nextInt();
		
		percent = ((attend*100/held));
		if(held>attend) {
			if(percent>=75) {
				System.out.println("Attendence is "+percent+"% Eligible to sit");
			} else {
				System.out.println("Attendence is "+percent+"% Not Eligible to sit");
			}
		} else {
			System.out.println("Enter correct no of attendence.");
		}
		

	}

}
