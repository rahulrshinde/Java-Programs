package Pattern;

public class Char4 {

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			char a = 'A';
			a+=i;
			for (int j=0; j<=i; j++) {
				System.out.print(a+" ");
				a+=5;
			} System.out.println();
		}

	}

}
