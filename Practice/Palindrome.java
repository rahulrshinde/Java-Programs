package Practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int temp=num;
		int rev=0;
		
		while(num>0) {
			int remainder = num%10;
			rev = rev*10 + remainder;
			num=num/10;
			
		}
		if (temp==rev) {
			System.out.println(temp+" is Palindeome");
		} else {
			System.out.println(temp+" is not Palindrome");
		}

	}

}
