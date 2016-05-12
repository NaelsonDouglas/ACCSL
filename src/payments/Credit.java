package payments;

public class Credit extends Payment {
	boolean international;

	public Credit(String from, Float amount, boolean international) {
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
	
	
	
	
}
