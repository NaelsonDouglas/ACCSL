package inspections;

import java.util.Date;

public abstract class Inspection {
	String address;
	boolean approved;
	boolean open; //is the inspection still in analysis?
	Date date;
	
	public Inspection(String address, boolean approved, boolean open, Date date) {
		super();
		this.address = address;
		this.approved = approved;
		this.open = open;
		this.date = date;
	}		
	
	public Inspection(){
		super();
		
	}
	
	public String toString() {
		return "Endereço: " + address + "\nAprovado: " + approved +
				"\nAberta: " + open + "\nData: " + date;
	}
	
	public abstract Inspection Inspection();
	
}
