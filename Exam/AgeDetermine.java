package Exam;

import java.util.Scanner;

public class AgeDetermine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Age: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second Age: ");
		int num2=sc.nextInt();
		
		System.out.println("Enter Third Age: ");
		int num3=sc.nextInt();
		
		if(num1!=num2&&num2!=num3&&num1!=num3) {
			if(num1>=num2&&num1>=num3) {
				System.out.println("Oldest Age: "+num1);
			} if(num2>=num1&&num2>=num3) {
				System.out.println("Oldest Age: "+num2);
			} if(num3>=num1&&num3>=num2) {
				System.out.println("Oldest Age: "+num3);
			} if(num1<=num2&&num1<=num3) {
				System.out.println("Youngest Age: "+num1);
			} if(num2<=num1&&num2<=num3) {
				System.out.println("Youngest Age: "+num2);
			} if(num3<=num1&&num3<=num2) {
				System.out.println("Youngest Age: "+num3);
			}
		} else if(num1==num2&&num2==num3&&num1==num3) {
			System.out.println("All Age are same.");
		} else if(num1==num2) {
			System.out.println("First and Second Age are same.");
		} else if(num1==num3) {
			System.out.println("First and Third Age are same.");
		} else if(num2==num3) {
			System.out.println("Second and Third Age are same.");
		}
		
	}

}
