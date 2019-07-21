package emailapp;

public class EmailApp {
	public static void main(String [] args){
		Email em1 = new Email("John","Smith");
		em1.setAlternateEmail("xyz@gmail.com");
		System.out.println("Alternate email address is "+em1.getAlternateEmail());
		em1.showInfo();
	}
}
