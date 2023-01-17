package Encapsulation;

public class Person 
{
	private int id;
	private String name;
	private String loc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public String toString()
	{
		return "Person Id\t: "+id+"\nPerson Name\t: "+name+"\nPerson Location\t: "+loc;
	}

}
