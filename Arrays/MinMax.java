package Arrays;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		int num[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array: ");
		for(int i=0; i<num.length; i++) {
			num[i]= sc.nextInt();
		}
		
		int min = num[0], max = num[0];
		
		for(int i=0; i<num.length; i++) {
			if(num[i]<min) {
				min=num[i];
			}
			else if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println("Minimum: "+min);
		System.out.println("Maximum: "+max);
	}
}
