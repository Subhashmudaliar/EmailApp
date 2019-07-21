package emailapp;

import java.util.*;

public class Email {
	//Encapsulation access through get and set.
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxcapacity=1000;
	private String alternateEmail;
	private int defpswlen=8;
	private String email;
	private String companySuffix="anycompany.com";
	//Constructor for initialization
	public Email(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email created :"+this.firstName+" "+this.lastName);
		this.department=setDepartment();
		System.out.println("Department :- "+this.department);
		this.password= randomPassword(defpswlen);
		System.out.println("Your password is"+this.password);
		email =firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("Your Email is :"+email);
	}
	//Department
	private String setDepartment(){
		System.out.println("Enter  the department\n1 for sales\n2 for development\n3 for Account\n0 for none");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice == 1){
			return "sales";
		}else if(deptChoice == 2){
			return "dev";
		}else if(deptChoice == 3){
			return "acct";
		}else{
			return "";
		}
	}
	
	private String randomPassword(int length){
		String defpass="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$";
		Random rand = new Random();
		char [] password = new char[length];
		for(int i = 0;i<length;i++){
			password[i] = defpass.charAt(rand.nextInt(defpass.length()));
		}
		return new String(password);
	}
	
	public void setMailboxCapacity(int capacity){
		this.mailboxcapacity= capacity;
	}
	public void setAlternateEmail(String alternateemail){
		this.alternateEmail=alternateemail;
	}
	public void changePassword(String password){
		this.password=password;
	}
	
	public int getMailBoxCapacity(){
		return mailboxcapacity;
	}
	
	public String getAlternateEmail(){
		return alternateEmail;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void showInfo(){
		System.out.println("Display Name "+firstName+" "+lastName);
		System.out.println("Company Email "+email);
		System.out.println("MailBoxCapactiy "+mailboxcapacity);
	}
}
