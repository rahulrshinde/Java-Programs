package Pattern;

public class Num4a {

	public static void main(String[] args) {
		int num;
		
		for (int i = 1; i <= 5; i++) {
		if(i%2 == 0) {
		num = 0;
		for (int j = 1; j <= i; j++) {
		System.out.print(num);
		num = (num == 0)? 1 : 0;
		}
		} else {
		num = 1;
		for (int j = 1; j <= i; j++)
		{
		System.out.print(num);
		num = (num == 0)? 1 : 0;
		}
		}
		System.out.println();
		}
	}
}