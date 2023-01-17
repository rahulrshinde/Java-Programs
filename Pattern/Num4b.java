package Pattern;

public class Num4b {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) { //1to5 range
			for (int j=0; j<i; j++) { 
				System.out.print(((i+j)%2)+" ");
			} System.out.println();
		}

	}

}
