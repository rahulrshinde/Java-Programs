package basic;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int num1, num2, choice;
		Scanner sc = new Scanner(System.in);
		
			while(true) {
				System.out.println("1.Addition ");
				System.out.println("2.Substraction ");
				System.out.println("3.Multiply ");
				System.out.println("4.Division ");
				System.out.println("5.Exit");
				System.out.println("Enter Your Choice ");
				choice = sc.nextInt();
				
				switch(choice) {
				case 1:
					System.out.println("Enter First Number: ");
					num1 = sc.nextInt();
					System.out.println("Enter Second Number: ");
					num2 = sc.nextInt();
					int add = num1+num2;
					System.out.println("Addition is "+add);
					break;
					
				case 2:
					System.out.println("Enter First Number: ");
					num1 = sc.nextInt();
					System.out.println("Enter Second Number: ");
					num2 = sc.nextInt();
					int sub = num1-num2;
					System.out.println("Subtraction is "+sub);
					break;
					
				case 3:
					System.out.println("Enter First Number: ");
					num1 = sc.nextInt();
					System.out.println("Enter Second Number: ");
					num2 = sc.nextInt();
					int mul = num1*num2;
					System.out.println("Multiply is "+mul);
					break;
					
				case 4:
					System.out.println("Enter First Number: ");
					num1 = sc.nextInt();
					System.out.println("Enter Second Number: ");
					num2 = sc.nextInt();
					int div = num1/num2;
					System.out.println("Division is "+div);
					break;
					
				case 5:
					System.out.println("Thanks For Using");
					System.exit(0);
					
				default:
					System.out.println("Enter Correct Choice");
				}
			}
	}

}
