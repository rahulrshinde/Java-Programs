package basic;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks: ");
		int marks = sc.nextInt();
		
		if(marks<=100&&marks>=80) {
			System.out.println("Your Marks is: "+marks+" Grade A");
		} else if(marks<=80&&marks>=65) {
			System.out.println("Your Marks is: "+marks+" Grade B");
		} else if(marks<=65&&marks>=55) {
			System.out.println("Your Marks is: "+marks+" Grade C");
		} else if(marks<=55&&marks>=45) {
			System.out.println("Your Marks is: "+marks+" Grade D");
		} else if(marks<=45&&marks>=26) {
			System.out.println("Your Marks is: "+marks+" Grade E");
		} else if(marks<=25&&marks>=0) {
			System.out.println("Your Marks is: "+marks+" Fail");
		} else {
			System.out.println("Invalid Marks.");
		}

	}

}
