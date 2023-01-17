package Bookminiproject;

import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int key;
		BookFunction call = new BookFunction();

		while(true){
			call.menu();
			key = sc.nextInt();

			switch(key){
			
			case 1:

				System.out.println("How Many Books you want to add: ");
				int temp = sc.nextInt();

				for(int i=0; i<temp; i++){
					call.add();
				}
				break;

			case 2:

				call.update();
				break;

			case 3:
				call.delete();
				break;

			case 4:
				call.search();
				break;

			case 5:

				System.out.println("Here are your all books");
				call.Getallbooks();
				break;

			case 6:

				System.out.println("Thank You!");
				System.exit(0);
				break;
				
			default:
				System.out.println("Enter Correct Choice! ");

			}
		}

	}

}
