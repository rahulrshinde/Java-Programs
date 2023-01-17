package Arrays;

public class Descending {

	public static void main(String[] args) {
		int num[] = {55,87,10,1,52,9,12,7,12,98,789,0,45,30,998};
		System.out.println("Array Before Sorting: ");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
			
		int temp=0;
		
		for(int i=0; i<num.length;i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i]<num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("");
		System.out.println("Array After Sorting: ");
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
