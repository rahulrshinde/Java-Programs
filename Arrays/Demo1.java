package Arrays;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		int num[] = new int[10]; //memory allocated
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Arrays: "); //Enter values by user
		for (int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println("Array Elements: "); //Display values
		for(int i=0; i<num.length; i++) {
			System.out.println("Element at Index ["+i+"] "+num[i]);
		}
		
	}

}
