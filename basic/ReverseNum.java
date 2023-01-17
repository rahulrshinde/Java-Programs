package basic;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, rev=0;
		System.out.println("Enter The Number: ");
		num = sc.nextInt();
		
		while(num>0) {
			int reminder = num%10;
			rev = rev*10 + reminder;
			num = num/10;
		}
		System.out.println("Reverse Number: "+rev);
	}

}
