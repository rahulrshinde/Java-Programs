package MyBank;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.time.format.DateTimeFormatter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

public class BankFunction {
	
	String Name, EmailId, AccType,atype;
	long MobNo, AccNo, sacc, racc;
	int count=0;
	float Bal, sbal, rbal;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	ArrayList<Bank> bank = new ArrayList<>();
	Bank adduser;
	Scanner sc = new Scanner(System.in);
	
	public void updatedata() throws IOException {
		try {
			oos = new ObjectOutputStream(new FileOutputStream("Bank Details.txt"));
			oos.writeObject(bank);
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			oos.close();
		}
	}
	
	public void readdata() throws IOException {
		try {
			ois = new ObjectInputStream(new FileInputStream("Bank Details.txt"));
			bank = (ArrayList<Bank>) ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			ois.close();
		}
	}
	
	public void writedata(Bank bank) throws IOException {
		try {
			readdata();
		} catch (Exception e) {
			System.out.println("File Not Found");
		}
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("Bank Details.txt"));
			this.bank.add(bank);
			oos.writeObject(this.bank);
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			oos.close();
		}
	}
	
	public void menu() {
		System.out.println("1.Add Account: ");
		System.out.println("2.Show Account: ");
		System.out.println("3.Show All Account: ");
		System.out.println("4.Delete Account: ");
		System.out.println("5.Deposit Money: ");
		System.out.println("6.Withdraw Money: ");
		System.out.println("7.Transfer Money: ");
		System.out.println("8.Exit");
		
	}
	
		// Email Validation
		public String ValidEmail(String EmailId) {
			if (EmailId==null && EmailId.isEmpty()) {
				System.out.println("Please Enter Email: ");
				return EmailId;
			}
			
			String emailRegex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
			Pattern pat = Pattern.compile(emailRegex);
			if(pat.matcher(EmailId).matches()) {
				//System.out.println(" ");
			}
			else {
				System.out.println("Invalid Email Id: ");
				EmailId = ValidEmail(sc.next());
			}
			return EmailId;
		}
	
		// Account Type Validation
		public String accountType() {
			System.out.println("1. Saving");
			System.out.println("2. Current");
			System.out.println("Enter Account Type: ");
			int at=sc.nextInt();
			
			if(at == 1) {
				atype="Saving";
			}
			else if(at == 2) {
				atype="Current";
			}
			else {
				System.out.println("Enter Account Type: ");
				atype=accountType();
			}
			return atype;
		}
	
		// Mobile No Validation
		public long Mobn() {
			System.out.println("Enter the Mobile No: ");
			String Mob =sc.next();
			if (Mob.length() == 10) {
				MobNo = Long.parseLong(Mob);
				
			}
			else {
				System.out.println("Please Enter 10 Digit Mobile No..!!");
				MobNo = Mobn();
			}
			return MobNo;
		}
	
		// Add Account
		public void add() throws IOException {
			try {
				readdata();
			} catch (Exception e) {
				// TODO: handle exception
			}
			// Name
			System.out.println("Enter the Name: ");
			Name=sc.next();
			
			// Email
			System.out.println("Enter the Email Id: ");
			EmailId=ValidEmail(sc.next());
			
			// Mobile Number
			MobNo=Mobn();
			
			// Account Number Generator
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");  
			LocalDateTime now = LocalDateTime.now();
			String str=dtf.format(now);
			AccNo = Long.parseLong(str); // String to long covert
			
			
			// Account Type
			AccType=accountType();
			
			// Balance
			System.out.println("Enter the Account Bal: ");
			Bal=sc.nextFloat();
			
			
			adduser = new Bank(Name,EmailId,AccType,MobNo,AccNo,Bal);
			// count++;
			System.out.println("Add Account Successfully");
			System.out.println("****************************");
			System.out.println(" ");
			writedata(adduser);
		}
		
		// Search Account
		public void search(){
			boolean found = false;
			try {
				readdata();
			} catch (Exception e) {
				// TODO: handle exception
			}

			System.out.println("Enter Account Number for Search: ");
			long ser =sc.nextLong();
			for(Bank user: bank){
				if(user != null && user.getAccNo()==ser){
					user.display();
					found = true;
				}
			}
			if(found == true){
				System.out.println("Search Successfully!");
				System.out.println("****************************");
				System.out.println(" ");
			}
			else {
				System.out.println("Enter Correct: ");
				search();
			}
		}
		
		// Show All Account
		public void showall(){
			try {
				readdata();
			} catch (Exception e) {
				// TODO: handle exception
			}
			for (Bank user: bank){
				if (user != null) {
					user.display();
					System.out.println("****************************");
					System.out.println(" ");
				}
			}
		}
		
		// Delete Account
		public void dlt() {
			try {
				readdata();
			} catch (Exception e) {
				// TODO: handle exception
			}
			boolean found=false;
			Bank tempuser = null;
			System.out.println("Enter Account Number for Delete: ");
			long dlt = sc.nextLong();
			for(Bank user: bank) {
				if (user != null && user.getAccNo()==dlt) {
					tempuser = user;
					found=true;
				}
			}
			if(found == true){
				bank.remove(tempuser);
				System.out.println("Delete Successfully!");
				System.out.println("****************************");
				System.out.println(" ");
			}
			else {
				System.out.println("Enter Correct: ");
				dlt();
			}
			
			try {
				updatedata();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		// Add Money
		public void addm() {
			try {
				readdata();
			} catch (Exception e) {
				// TODO: handle exception
			}
			boolean found=false;
			
			System.out.println("Enter User Account Number to Deposit Money: ");
			long addn = sc.nextLong();
			for(Bank user: bank) {
				if (user != null && user.getAccNo()==addn) {
					Bal = user.getBal();
					System.out.println("Enter Amount to Add: ");
					float tBal = sc.nextFloat();
					Bal += tBal;
					user.setBal(Bal);
					found = true;
				}
			}
			if(found == true){
				System.out.println("Balance Deposit Successfully!");
				System.out.println("****************************");
				System.out.println(" ");
			}
			else {
				System.out.println("Enter Correct: ");
				addm();
			}
			
			try {
				updatedata();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		// Remove Money
		public void rmv() {
			try {
				readdata();
			} catch (Exception e) {
				// TODO: handle exception
			}
			boolean found=false;
					
			System.out.println("Enter User Account Number to Withdraw Money: ");
			long rmvn = sc.nextLong();
			for(Bank user: bank) {
				if (user != null && user.getAccNo()==rmvn) {
					Bal = user.getBal();
					System.out.println("Enter Amount to Remove: ");
					float trBal = sc.nextFloat();
					Bal -= trBal;
					if(Bal>=500) {
					user.setBal(Bal);
					found = true;
					}
					else {
						System.out.println("Insufficient Fund...!!!");
					}
				}
			}
			if(found == true){
				System.out.println("Balance Withdraw Successfully!");
				System.out.println("****************************");
				System.out.println(" ");
			}
			try {
				updatedata();
			} catch (Exception e) {
				// TODO: handle exception
			}
					
		}
		
		// Transfer Money
		public void trans() {
			try {
				readdata();
			} catch (Exception e) {
				// TODO: handle exception
			}
			boolean found=false;
			
			System.out.println("Enter Sender Account No: ");
			sacc = sc.nextLong();
			for(Bank user: bank) {
				if (user != null && user.getAccNo()==sacc) {
					Bal = user.getBal();
					System.out.println("Enter Amount to Send: ");
					sbal = sc.nextFloat();
					Bal -= sbal;
					if(Bal>=500) {
					user.setBal(Bal);
					}
					else {
						System.out.println("Insufficient Fund to Transfer Money...!!!");
					}
				}
			}
			if(Bal<=499) {
				System.out.println(" ");
			}
			else {
			System.out.println("Enter Receiver Account No: ");
			racc = sc.nextLong();
			if (sacc == racc) {
				System.out.println("Account Number Same as Sender Account No...!!!");
				System.out.println("Enter Correct Receiver Account Number: ");
				racc = sc.nextLong();
			}
			for(Bank user: bank) {
				if (user != null && user.getAccNo()==racc) {
					Bal = user.getBal();
					rbal = sbal;
					Bal += rbal;
					user.setBal(Bal);
					found=true;
				}
			}
			}
			if(found == true){
				System.out.println("Transfer Successfully!");
				System.out.println("****************************");
				System.out.println(" ");
			}
			else {
				System.out.println("Transfer Fail...!!!");
			}
			
			try {
				updatedata();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		
}