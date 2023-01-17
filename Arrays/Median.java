package Arrays;

public class Median {

	public static void main(String[] args) {
		int num[] = {55,87,10,1,52,9,12,7,12,98,789,0,45,30,998};
		
		int temp=0;
		
		for(int i=0; i<num.length;i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[j]<num[i]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		
		double m=0;
		
		if(num.length % 2 == 1) {
			m=num[(num.length+1)/2-1]; //length of element[odd] +1 then /2 then -1
		}
		else {
			m=(num[num.length/2-1]+num[num.length/2])/2; //length of element [even] /2 then -1 and without -1 then both addition.
		}
			System.out.println("Median: "+m);
	}

}
