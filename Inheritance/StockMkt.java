package Inheritance;

class Share
{
	String Script,name;
	
	Share(String Script, String name)
	{
		this.Script=Script;
		this.name=name;
	}
	
	void ShareData()
	{
		System.out.println("Enter Script Name: "+Script);
		System.out.println("Enter Share Name: "+name);
	}
	
}

class ShareHolder extends Share
{
	int Invest;
	
	ShareHolder(String Script, String name, int Invest)
	{
		super(Script,name);
		this.Invest=Invest;
	}
	
	void HolderData()
	{
		System.out.println("Enter Investment Amount: "+Invest);
	}
}



public class StockMkt {

	public static void main(String[] args) {
		ShareHolder h1 = new ShareHolder("ISN101", "TCS", 15000);
		h1.ShareData();
		h1.HolderData();
		

	}

}
