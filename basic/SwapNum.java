package basic;

import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		int num1, num2, temp;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Before Swap: ");
			System.out.println("Enter First Number: ");
			num1 = sc.nextInt();
			System.out.println("Enter Second Number: ");
			num2 = sc.nextInt();
			
			temp=num1;
			num1=num2;
			num2=temp;
			
			System.out.println("After Swap: ");
			System.out.println("First Number: "+num1);
			System.out.println("Second Number: "+num2);
		} while(num1==num2); //this condition is false so, loop stop.

	}

}
