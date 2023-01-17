package basic;

import java.util.Scanner;

public class SwapNumWithoutTemp {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Before Swap: ");
			System.out.println("Enter First Number: ");
			num1 = sc.nextInt();
			System.out.println("Enter Second Number: ");
			num2 = sc.nextInt();
			
			num1=num1+num2; //num1=10,num2=20	num1=10+20=30
			num2=num1-num2; //num2=30-20=10
			num1=num1-num2; //num1=30-10=20
			
			System.out.println("After Swap: ");
			System.out.println("First Number: "+num1);
			System.out.println("Second Number: "+num2);
		} while(num1==num2);

	}

}
