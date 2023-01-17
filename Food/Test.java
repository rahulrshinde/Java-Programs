package Food;

public class Test {

	public static void main(String[] args) {
		Food f1 = new Food();
		f1.setFid(101);
		f1.setFtype("Vegetables");
		f1.setFname("cabbage");
		f1.setFqty(1);
		f1.setFprice(20);
		
		System.out.println(f1);
		System.out.println(" ");
		
		Food f2 = new Food();
		f2.setFid(201);
		f2.setFtype("Fruits");
		f2.setFname("apple");
		f2.setFqty(5);
		f2.setFprice(100);
		
		System.out.println(f2);
		System.out.println(" ");
		
		Food f3 = new Food();
		f3.setFid(102);
		f3.setFtype("Vegetables");
		f3.setFname("cucumber");
		f3.setFqty(1);
		f3.setFprice(25);
		
		System.out.println(f3);
		System.out.println(" ");
		
		Food f4 = new Food();
		f4.setFid(401);
		f4.setFtype("Meat and Poultry");
		f4.setFname("chicken");
		f4.setFqty(1);
		f4.setFprice(250);
		
		System.out.println(f4);
		System.out.println(" ");
		
		Food f5 = new Food();
		f5.setFid(501);
		f5.setFtype("Fish");
		f5.setFname("carp");
		f5.setFqty(5);
		f5.setFprice(300);
		
		System.out.println(f5);

	}

}
