package payments;

public abstract class Payment {
	String from;
	Float amount;
	public Payment(String from, Float amount) {
		super();
		this.from = from;
		this.amount = amount;
	}
	public Payment() {
		super();
	}
	
	public abstract Payment Payment();
	@Override
	public String toString() {
		return "From: " + from + "\nAmount: " + amount;
	}
	
	
}
