package Food;

public class Food {
	private int fid;
	private String ftype,fname;
	private float fqty,fprice;
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFtype() {
		return ftype;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public float getFqty() {
		return fqty;
	}
	public void setFqty(float fqty) {
		this.fqty = fqty;
	}
	public float getFprice() {
		return fprice;
	}
	public void setFprice(float fprice) {
		this.fprice = fprice;
	}
	
	public String toString() {
		return "Enter Food id\t\t: "+fid + "\nEnter Type of Food\t: "+ftype + "\nEnter Food Name\t\t: "+fname + "\nEnter Quantity of Food\t: "+fqty + "\nEnter Price\t\t: "+fprice;
	}

}
