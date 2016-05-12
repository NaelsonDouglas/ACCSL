package payments;

public class Money extends Payment{
	Integer centralBankNote;

	public Money(String from, Float amount, Integer centralBankNote) {
		super(from, amount);
		this.centralBankNote = centralBankNote;
	}

	public Money() {
		super();
	}

	@Override
	public payments.Payment Payment() {
		return new Money();
	}

	@Override
	public String toString() {
		return super.toString()+"\nCentral Bank note: " + centralBankNote;
	}
	
	
	
	
	
	
	
}
