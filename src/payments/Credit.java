package payments;

import java.util.Scanner;

import global.GlobalInterface;

public class Credit extends Payment {
	String international;

	public Credit(String from, Integer amount, String  international) {
		super(from, amount);
		this.international = international;
	}

	public Credit() {
		super();
	}

	@Override
	public payments.Payment Payment() {
		return new Credit();
	}

	@Override
	public String toString() {
		return super.toString()+"\nInternational: " + international + "]";
	}

	
	
	
	
	public String  isInternational() {
		return international;
	}

	public void setInternational(String  international) {
		this.international = international;
	}

	@Override
	public GlobalInterface create() {
		Credit output = new Credit();
		Scanner scan = new Scanner(System.in);	
		System.out.println("Credit Card: ");
		setInternational(scan.next());		
		return output;
	}
	
	
	
	
}
