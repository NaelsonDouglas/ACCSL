package constructions;

import global.GlobalInterface;

import java.util.Date;
import java.util.Scanner;
import java.util.Set;

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
	
	public void superSet(){
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Cliente: ");
		 client = scan.next();
		 System.out.println("License: ");
		 license = scan.next();
		 System.out.println("Start Date: ");
		 startDate = scan.next();
		 System.out.println("Deadline: ");
		 deadline = scan.next();
		 
		 setClient(client);
		 setLicense(license);
		 setStartDate(startDate);
		 setDeadline(deadline);		 
	}
	
	
	
	public String getClient() {
		return client;
	}


	public void setClient(String client) {
		this.client = client;
	}


	public String getLicense() {
		return license;
	}


	public void setLicense(String license) {
		this.license = license;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getDeadline() {
		return deadline;
	}


	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}


	public boolean isDone() {
		return done;
	}


	public void setDone(boolean done) {
		this.done = done;
	}


	public abstract Construction Construction();
	
	
}
