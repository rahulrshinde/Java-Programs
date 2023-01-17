package MyBank;

import java.io.Serializable;

public class Bank implements Serializable {
	private String Name,EmailId,AccType;
	private long MobNo, AccNo;
	private float Bal;
	
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getAccType() {
		return AccType;
	}

	public void setAccType(String accType) {
		AccType = accType;
	}
	
	public long getAccNo() {
		return AccNo;
	}

	public void setAccNo(long accNo) {
		AccNo = accNo;
	}

	public long getMobNo() {
		return MobNo;
	}

	public void setMobNo(long mobNo) {
		MobNo = mobNo;
	}

	public float getBal() {
		return Bal;
	}

	public void setBal(float bal) {
		Bal = bal;
	}

	Bank(String Name, String EmailId, String AccType, long MobNo, long AccNo, float Bal){
		this.Name=Name;
		this.EmailId=EmailId;
		this.AccType=AccType;
		this.MobNo=MobNo;
		this.AccNo=AccNo;
		this.Bal=Bal;
	}
	
	public void display() {
		System.out.println("Name: "+Name);
		System.out.println("Email Id: "+EmailId);
		System.out.println("Account Type: "+AccType);
		System.out.println("Mobile Number: "+MobNo);
		System.out.println("Account Number: "+AccNo);
		System.out.println("Account Bal: "+Bal);
	}
	
}
