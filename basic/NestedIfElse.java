package basic;

public class NestedIfElse {

	public static void main(String[] args) {
		int age = 24;
		
		if (age>=18) {
			if (age<=60) {
				System.out.println("Eligible for voting");
			} else {
				System.out.println("Not Eligible, your age is Greater than 60");
			}
		} else {
			System.out.println("Not Eligible, your age is less than 18");
		}

	}

}
