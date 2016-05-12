package payments;

import java.util.Scanner;

import global.GlobalInterface;

public class Money extends Payment{
	Integer centralBankNote;

	public Money(String from, Integer amount, Integer centralBankNote) {
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
		return super.toString()+"\nNota do BC: " + centralBankNote;
	}

	public Integer getCentralBankNote() {
		return centralBankNote;
	}

	public void setCentralBankNote(Integer centralBankNote) {
		this.centralBankNote = centralBankNote;
	}

	@Override
	public GlobalInterface create() {

		Money output = new Money();
		output.superSet();
		
		System.out.println("Nota do Banco Central: ");
		Scanner scan = new Scanner(System.in);	
		output.setCentralBankNote(scan.nextInt());		
		return output;
	}
	
	
	
	
	
	
	
}
