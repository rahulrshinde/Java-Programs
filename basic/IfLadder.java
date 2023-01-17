package basic;

import java.util.Scanner;

public class IfLadder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day ");
		int day = sc.nextInt();
		
		if(day==1) {
			System.out.println("Mon");
		} 
		if(day==2) {
			System.out.println("Tues");
		}
		if(day==3) {
			System.out.println("Wed");
		}
		if(day==4) {
			System.out.println("Thu");
		}
		if(day==5) {
			System.out.println("Fri");
		}
		if(day==6) {
			System.out.println("Sat");
		}
		if(day==7) {
			System.out.println("Sun");
		} else {
			System.out.println("Invalid Input");
		}

	}

}
