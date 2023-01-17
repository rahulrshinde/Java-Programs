package MyBank;

import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key;
		BankFunction call = new BankFunction();

		while(true){
			call.menu();
			key = sc.nextInt();

			switch(key){
			
			case 1:
				try {
					call.add();
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
				
			case 2:
				call.search();
				break;
				
			case 3:
				call.showall();
				break;
				
			case 4:
				call.dlt();
				break;
				
			case 5:
				call.addm();
				break;
				
			case 6:
				call.rmv();
				break;
				
			case 7:
				call.trans();
				break;
				
			case 8:

				System.out.println("Thank You!");
				System.exit(0);
				break;
				
			default:
				System.out.println("Enter Correct Choice...!!! ");

			}
		}


	}

}
