package constructions;

import global.GlobalInterface;

import java.util.Date;

public abstract class Construction implements GlobalInterface {
	
	String client;
	String license;
	String startDate;
	String deadline;
	boolean done;
	
	
	
	public Construction(String client, String license, String startDate2,
			String deadline2, boolean done) {
		super();
		this.client = client;
		this.license = license;
		this.startDate = startDate2;
		this.deadline = deadline2;
		this.done = done;
	}
	
	
	@Override
	public String toString() {
		return "Cliente: " + client + "\nLicença: " + license
				+ "\nInício: " + startDate + "\nFim: " + deadline
				+ "\nCompleta: " + done;
	}


	public Construction() {
		super();		
	}
	
	
	public abstract Construction Construction();
	
	
}
