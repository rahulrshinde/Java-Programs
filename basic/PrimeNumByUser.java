package basic;

import java.util.Scanner;

public class PrimeNumByUser {

	public static void main(String[] args) {
		int counter=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt(); //num = 10
		
		for(int i=1;i<=num;i++) { //i<=10
			if(num%i==0) { //10%1==0, 10%2==0, 10%3==1, 10%4==2, 10%5==0
				counter++;
			}
		}
		if(counter==2) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not Prime Number");
		}
	}

}
