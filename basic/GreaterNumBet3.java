package basic;

public class GreaterNumBet3 {

	public static void main(String[] args) {
		int num1=50,num2=40,num3=30;
		
		if (num1>num2 && num1>num3) {
			System.out.println(num1+ " is Greater");
		} else if (num2>num1 && num2>num3) {
			System.out.println(num2+ " is Greater");
		} else {
			System.out.println(num3+ " is Greater");
		}

	}

}
