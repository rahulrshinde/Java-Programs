package basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		int temp=num;
		int rev=0;
		int counter=0;
		
		while(num>0) {
			int reminder = num%10;
			rev = rev*10 + reminder;
			num = num/10;
			counter++;
		}
		System.out.println("The Number is "+counter+" Digit.");
		if(temp==rev) {
			System.out.println(temp+ " is Palindrome.");
		} else {
			System.out.println(temp+ " is not Palindrome.");
		}

	}

}
