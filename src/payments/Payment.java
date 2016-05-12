package payments;

import java.util.Scanner;

import global.GlobalInterface;

public abstract class Payment implements GlobalInterface{
	String from;
	Integer amount;
	public Payment(String from, Integer amount) {
		super();
		this.from = from;
		this.amount = amount;
	}
	public Payment() {
		super();
	}
	
	public void superSet(){
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Pagador: ");
		setFrom(scan.next());
		System.out.println("Quantidade: ");
		setAmount(scan.nextInt());
		
		
	}
	
	
	
	
	
	
	
	
	
	public abstract Payment Payment();
	
	@Override
	public String toString() {
		return "From: " + from + "\nAmount: " + amount;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	
	
	
}
