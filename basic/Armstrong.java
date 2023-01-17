package basic;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int temp, remainder, result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		temp=num;
		
		while(temp > 0) {
			remainder = temp % 10;
			result += Math.pow(remainder, 3); //remainder*remainder*remainder
			temp /= 10;
		}
		if(result==num)
			System.out.println(num+" is an Armstrong");
		else 
			System.out.println(num+" is not an Armstrong");
	}
}
