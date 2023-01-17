package Inheritance;

class Phone //Parent class
{
	int Storage,Ram;
	
	Phone(int storage, int ram) 
	{
		Storage = storage;
		Ram = ram;
	}
	
	void PhoneShow() 
	{
		System.out.println("Phone Storage is: "+Storage+" GB");
		System.out.println("Phone Ram is: "+Ram+" GB");
	}
	
}

class App extends Phone //Child class 1
{
	String AppName;

	App(String appname, int storage, int ram) 
	{
		super(storage, ram);
		this.AppName=appname;
		
	}
	
	void AppShow()
	{
		System.out.println("App Name is: "+AppName);
	}
	
}

class Game extends App //Child class 2 //MultiLevel Done.
{
	String GameName;
	Game(String appname, String gamename, int storage, int ram)
	
	{
		super(appname, storage,ram);
		this.GameName=gamename;
	}
	
	void GameShow()
	{
		System.out.println("Game name is: "+GameName);
	}
}

class App2 extends Phone
{
	String AppName2;
	App2(String appname2, int strorage, int ram)
	{
		super(strorage,ram);
		this.AppName2=appname2;
	}
	
	void App2Show()
	{
		System.out.println("App name is: "+AppName2);
	}
}

class Game2 extends Phone //Hierarchical Done
{
	String GameName2;
	Game2(String gamename2,int storage, int ram)
	{
		super(storage,ram);
		this.GameName2=gamename2;
	}
	
	void Game2Show()
	{
		System.out.println("Game name is: "+GameName2);
	}
}

public class Mobile {

	public static void main(String[] args) {
		
		System.out.println("Single Level");
		App obj1 = new App("Instagram",32,2);
		obj1.AppShow();
		obj1.PhoneShow();
		System.out.println(" ");
		
		System.out.println("Multilevel");
		Game obj2 = new Game("WhatsApp","Cricket",64,4);
		obj2.AppShow();
		obj2.GameShow();
		obj2.PhoneShow();
		System.out.println(" ");
		
		System.out.println("Hirarchical");
		App2 obj3 = new App2("Facebook",128,6);
		obj3.App2Show();
		obj3.PhoneShow();
		System.out.println(" ");
		Game2 obj4 = new Game2("Football",128,6);
		obj4.Game2Show();
		obj4.PhoneShow();
		

	}

}
