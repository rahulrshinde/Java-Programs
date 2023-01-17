package ClassConstuctor;

class Test{
	
	String CPU, Storage, Ram;
	
	Test(){
		CPU = "Intel i3 9th Gen";
		Storage = "250GB SSD";
		Ram = "8GB";
	}
	
	Test(String C,String S,String R){
		this.CPU = C;
		this.Storage = S;
		this.Ram = R;
	}
}


public class Computer {

	public static void main(String[] args) {
		Test c1 = new Test("Intel i5 10th Gen","1TB","16GB");
		System.out.println("First Computer Specification: ");
		System.out.println("CPU Name is: "+c1.CPU);
		System.out.println("Storage is: "+c1.Storage);
		System.out.println("Ram is: "+c1.Ram);
		System.out.println("************************************************");
		System.out.println(" ");
		
		Test c2 = new Test("Ryzen 5000","500GB SSD","8GB");
		System.out.println("Second Computer Specification: ");
		System.out.println("CPU Name is: "+c2.CPU);
		System.out.println("Storage is: "+c2.Storage);
		System.out.println("Ram is: "+c2.Ram);
		System.out.println("************************************************");
		System.out.println(" ");
		
		Test c3 = new Test();
		System.out.println("Third Computer Specification: ");
		System.out.println("CPU Name is: "+c3.CPU);
		System.out.println("Storage is: "+c3.Storage);
		System.out.println("Ram is: "+c3.Ram);
		System.out.println("************************************************");
		System.out.println(" ");

	}

}
