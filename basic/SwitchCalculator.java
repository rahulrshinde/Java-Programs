package basic;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("1.Additon ");
		  System.out.println("1.Substraction ");
		  System.out.println("1.Multiply ");
		  System.out.println("1.Division ");
		  System.out.println("Enter Your Choice ");
		  int key = sc.nextInt();
		  int num1, num2;
		  
		  switch (key){
		      case 1:
		      System.out.println("Enter First Number : ");
		      num1 = sc.nextInt();
		      System.out.println("Enter Second Number : ");
		      num2 = sc.nextInt();
		      
		      int add = num1+num2;
		      System.out.println("Additon is  "+add);
		      break;
		      
		      case 2:
		      System.out.println("Enter First Number : ");
		      num1 = sc.nextInt();
		      System.out.println("Enter Second Number : ");
		      num2 = sc.nextInt();
		      
		      int sub = num1-num2;
		      System.out.println("Substraction is  "+sub);
		      break;
		      
		      case 3:
		      System.out.println("Enter First Number : ");
		      num1 = sc.nextInt();
		      System.out.println("Enter Second Number : ");
		      num2 = sc.nextInt();
		      
		      int mul = num1*num2;
		      System.out.println("Multiply is  "+mul);
		      break;
		      
		      case 4:
		      System.out.println("Enter First Number : ");
		      num1 = sc.nextInt();
		      System.out.println("Enter Second Number : ");
		      num2 = sc.nextInt();
		      
		      int div = num1/num2;
		      System.out.println("Division is  "+div);
		      break;
		      
		      default :
		      System.out.println("Enter Correct Choice");
		  }

	}

}
